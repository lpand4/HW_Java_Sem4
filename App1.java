import java.util.Arrays;

/**
 * +Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */
public class App1 {
    public static void main(String[] args) {
        int[] arr = {14,61,85,21,0,24,0,74,-2,26,17,50,40,45,21,32,59,58,13,-3};
        int N = arr.length;
        System.out.println(Arrays.toString(arr));
        heapSort(arr, N);
        System.out.println(Arrays.toString(arr));
    }
 
    public static void heapify(int arr[], int n, int i)
    {   
        int left = i * 2 + 1;   
        int right = i * 2 + 2;
        int largest = i;
        
        if(left < n && arr[left] > arr[largest])      largest = left;
        if(right < n && arr[right] > arr[largest])    largest = right;
        
        if(i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }        
    }
    
    public static void heapSort(int arr[], int n)
    {
        for (int i = n / 2 - 1; i >=0; i--) {
            heapify(arr, n, i);            
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;   
            
            heapify(arr, i, 0);
        }
    }
}