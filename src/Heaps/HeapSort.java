package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Heap{
    public List<Integer> Sort(int[] arr){
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        heapstructure(arr,list);
//        System.out.println(list);
        remove(list,ans);
        return ans;
    }
    public static List<Integer> heapstructure(int[] arr,List<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            int j=i;
            while(j/2>=0){
                if(list.get(j)<list.get(j/2)){
                    int temp = list.get(j/2);
                    list.set(j/2, list.get(j));
                    list.set(j, temp);
                    j=j/2;
                }else{
                    break;
                }
            }
        }
        return list;
    }
    public static void remove(List<Integer> list, List<Integer> ans) {
        while (!list.isEmpty()) {
            // Add the smallest element (root) to the answer list
            ans.add(list.get(0));

            // Replace root with the last element
            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);

            // Heapify down from the root
            int j = 0;
            while (2 * j + 1 < list.size()) {
                int leftIndex = 2 * j + 1;
                int rightIndex = 2 * j + 2;

                // Find the smallest child
                int minIndex = leftIndex; // Assume left is smaller
                if (rightIndex < list.size() && list.get(rightIndex) < list.get(leftIndex)) {
                    minIndex = rightIndex;
                }

                // Compare with the current node
                if (list.get(j) <= list.get(minIndex)) {
                    break; // Heap property is satisfied
                }

                // Swap with the smaller child
                int temp = list.get(j);
                list.set(j, list.get(minIndex));
                list.set(minIndex, temp);

                // Move down to the next level
                j = minIndex;
            }
        }
    }

}

public class HeapSort {
    public static void main(String[] args) {
        Heap h1=new Heap();
        System.out.println(h1.Sort(new int[]{4,1,3,2,16,9,10,14,8,7}));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    }
}
