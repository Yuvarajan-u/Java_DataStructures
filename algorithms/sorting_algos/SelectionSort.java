package algorithms.sorting_algos;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        // Iterate through each element in the array
        for(int i =0;i<arr.length;i++){
            // Assume current index has minimum value
            int minIndex = i;

            // Find the minimum element in unsorted portion
            for(int j = i+1;j<arr.length;j++){
                // If we find a smaller element, update minIndex
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap only if we found a smaller element
            if(i!=minIndex){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }

    }
    public static void main(String[] args) {
        // Create test array and demonstrate sorting
        int [] array = new int[]{4,2,1,5,3,6};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
/** 
i =4
j =2

i =2 
j =4
2,4,1,5,3,6


i =2
j =1

1 2 4 5 3 6

i =1


**/
