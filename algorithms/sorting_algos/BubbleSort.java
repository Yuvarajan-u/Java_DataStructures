package algorithms.sorting_algos;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int [] arr){
        // outer loop: perform passes, each pass moves the next largest element to its final position
        for(int i = arr.length-1; i >= 0; i--){
            // inner loop: scan the unsorted portion from start up to i-1
            for(int j = 0; j < i; j++){
                // compare adjacent elements and swap if out of order
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];    // store left value
                    arr[j] = arr[j+1];    // move smaller right value left
                    arr[j+1] = temp;      // place stored value to right
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
       
        int [] array = new int[]{4,2,1,5,3,6};
        bs.bubbleSort(array);
        System.out.println(Arrays.toString(array));        
    }
}
