package hashtable.interview_topics;

import java.util.HashMap;

import hashtable.HashTable;

public class ItemInCommon {
    public boolean inefficientway(int arr1[], int arr2[]){
        for(int i: arr1){
            for(int j: arr2){
                if(i ==j) return true;
            }
        }
        return false;
    }

    /**
     * Checks if there is any item in common between two integer arrays using a HashMap for efficient lookup.
     *
     * @param arr1 the first array of integers
     * @param arr2 the second array of integers
     * @return true if there is at least one item in common between arr1 and arr2, false otherwise
     *
     * Note: We cannot check for `if (map.get(i) == true)` because `map.get(i)` returns null if the key is not present, not false.
     */
     public boolean efficientway(int arr1[], int arr2[]){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for(int i:arr1){
            myHashMap.put(i, true);
        }
        for(int i:arr2){

            if(myHashMap.get(i) != null) return true;
        }
        return false;
     }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 3};
        ItemInCommon checker = new ItemInCommon();
        boolean result = checker.inefficientway(arr1, arr2);
        System.out.println(result);
        System.out.println(checker.efficientway(arr1, arr2));
    }
}
