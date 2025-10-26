package algorithms.sorting_algos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
       
        int [] array = new int[]{4,2,1,5,3,6};
        bs.bubbleSort(array);
        System.out.println(Arrays.toString(array));        
    }

}