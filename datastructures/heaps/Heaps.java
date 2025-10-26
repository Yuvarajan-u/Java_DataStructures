package heaps;
import java.util.ArrayList;
import java.util.List;

public class Heaps {
    private List<Integer> heap;

    public Heaps() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
    //    List<Integer> tempArr = getHeap(); // not useful has the helper functions are directly using heap.
        heap.add(value);
       int current = heap.size()-1;


    // Bubble up the newly added element to maintain the max-heap property
    while(current > 0 && heap.get(current) > heap.get(parent(current))){
        // If the current element is greater than its parent, swap them
        swap(current, parent(current));
        // Move up to the parent's index and continue checking
        current = parent(current);
    }

    }

    public Integer remove(){
        if (heap.size() ==0) return null;
        if (heap.size()>1){
            int maxValue = heap.get(0);
            int bottomright = heap.size()-1;

            heap.set(0, heap.remove(bottomright));
            sinkdown(0);
            
            return maxValue;
        }
        return heap.remove(0);
    }

    public void sinkdown(int index){
        int maxIndex = index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if(leftIndex<heap.size() && heap.get(leftIndex)>heap.get(maxIndex)){
                maxIndex = leftIndex;
            }
            if(rightIndex<heap.size() && heap.get(rightIndex)>heap.get(maxIndex)){
                maxIndex = rightIndex;
            }
            if(maxIndex!=index){
                swap(index, maxIndex);
                index = maxIndex;
            }
            else{
                return ;
            }
        }
    }

     public void insertMinHeap(int value){
    //    List<Integer> tempArr = getHeap(); // not useful has the helper functions are directly using heap.
        heap.add(value);
       int current = heap.size()-1;


    // Bubble up the newly added element to maintain the max-heap property
    while(current > 0 && heap.get(current) < heap.get(parent(current))){
        // If the current element is greater than its parent, swap them
        swap(current, parent(current));
        // Move up to the parent's index and continue checking
        current = parent(current);
    }

    }

    // remove is same for both min and max heap as its to remove the top node, but sinkdown will change
    

}






