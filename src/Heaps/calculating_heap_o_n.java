package Heaps;

import java.util.Arrays;

public class calculating_heap_o_n {
    public static void main(String[] args) {
        int[] arr={1, 3, 13, 6, 3, 14, 13};
        for (int i = arr.length/2; i>=0 ; i--) {
            heapify(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void heapify(int[] arr,int i){

            int left=2*i+1;
            int right=2*i+2;
            int max=i;
            if(left<arr.length && arr[left]>arr[max]){
                max=left;
            }
            if(right<arr.length && arr[right]>arr[max]){
                max=right;
            }
            if(i!=max){
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
                heapify(arr,max);
            }

    }


}
