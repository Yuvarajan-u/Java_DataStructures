package algorithms.sorting_algos;

import java.util.Arrays;
// Step-by-step visualization for sorting [4, 2, 1, 5, 3, 6] with the given insertionSort (shows array after each swap/shift):

// Initial:
// [4, 2, 1, 5, 3, 6]

// i = 1 (temp = 2)
// - compare 2 < 4 → true
// - shift and place temp:
// [4, 4, 1, 5, 3, 6]
// [2, 4, 1, 5, 3, 6]
// After i=1:
// [2, 4, 1, 5, 3, 6]

// i = 2 (temp = 1)
// - compare 1 < 4 → true
// [2, 4, 4, 5, 3, 6]
// [2, 1, 4, 5, 3, 6]
// - compare 1 < 2 → true
// [2, 2, 4, 5, 3, 6]
// [1, 2, 4, 5, 3, 6]
// After i=2:
// [1, 2, 4, 5, 3, 6]

// i = 3 (temp = 5)
// - compare 5 < 4 → false (no changes)
// After i=3:
// [1, 2, 4, 5, 3, 6]

// i = 4 (temp = 3)
// - compare 3 < 5 → true
// [1, 2, 4, 5, 5, 6]
// [1, 2, 4, 3, 5, 6]
// - compare 3 < 4 → true
// [1, 2, 4, 4, 5, 6]
// [1, 2, 3, 4, 5, 6]
// After i=4:
// [1, 2, 3, 4, 5, 6]

// i = 5 (temp = 6)
// - compare 6 < 5 → false (no changes)
// Final:
// [1, 2, 3, 4, 5, 6]


public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // element to insert into the sorted portion on the left
            int temp = arr[i];
            // start comparing from the element just left of i
            int j = i - 1;
            // shift larger elements to the right until we find the right spot for temp
            // (j > -1 prevents going out of bounds; temp < arr[j] means arr[j] should move right)
            while (j > -1 && temp < arr[j]) {
                // move the larger element one position to the right
                arr[j + 1] = arr[j];
                // place temp into the vacated slot (this implementation repeatedly swaps temp left)
                arr[j] = temp;
                // continue checking further left
                j--;
            }
            
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 1, 5, 3, 6 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
