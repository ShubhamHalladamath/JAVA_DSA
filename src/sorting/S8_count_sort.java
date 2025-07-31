package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S8_count_sort {
    public static void main(String[] args) {
        int[] arr={8,6,9,4,3,1,1,3,4};
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(max,arr[i+1]);
        }
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freq);
        int count=0;

        for (int i = 0; i <= max; i++) {
            if(freq.containsKey(i)){
                int temp=freq.get(i);
                for(int j=0;j<temp;j++){
                       if(count<arr.length){
                           arr[count++]=i;
                       }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
