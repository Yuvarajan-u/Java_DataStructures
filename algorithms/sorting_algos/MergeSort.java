package algorithms.sorting_algos;
import java.lang.reflect.Array;
import java.util.Arrays;;


public class MergeSort {
    

    public int [] merge(int [] array1, int [] array2){
        int [] combined = new int[(array1.length+array2.length)];
        int i = 0;
        int j = 0;
        int index =0;
        while( i< array1.length && j <array2.length){
            if(array1[i]<array2[j]){
                combined[index]=array1[i];
                i++;
                index++;
            }
            else{
                combined[index]= array2[j];
                j++;
                index++;
            }
        }
        while(i<array1.length){
            combined[index]=array1[i];
                i++;
                index++;
        }
        while(j<array2.length){
            combined[index]=array2[j];
            j++;
            index++;
        }
        return combined;
    }


    public int [] mergeSort(int [] arr){
        if (arr.length ==1 ) return arr;

        int midIndex = arr.length/2;

        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int [] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2 = {4,5,6};
        MergeSort ms = new MergeSort();
        int [] combined = ms.merge(arr1,arr2);
        System.out.println(Arrays.toString(combined));

        int [] arr3 = {8,3,1,5,4,6,7,2};
        int [] result = ms.mergeSort(arr3);

        System.out.println(Arrays.toString(result));
    }
}
