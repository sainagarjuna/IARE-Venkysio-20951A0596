import java.util.*;

class Main {
  
    static void heapify(int arr[], int n, int i) {
        int largest = i;  
        int l = 2 * i + 1;  
        int r = 2 * i + 2;  
  
        
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
        
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            
            heapify(arr, n, largest);
        }
    }
  
    
    static void heapSort(int arr[]) {
        int n = arr.length;
  
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
  
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
  
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
  
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
  
        heapSort(arr);
  
        System.out.println(Arrays.toString(arr));
    }
}
