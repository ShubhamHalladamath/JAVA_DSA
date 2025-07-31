package recurssion;

import java.util.Arrays;

public class re_SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr,arr.length-1)));
    }
    static int[] sort(int[] arr,int end){
        if(end==0){
            return arr;
        }
        int max=maximum(arr,end);
        swap(arr,max,end);
        return sort(arr,end-1);
    }
    static int maximum(int[] arr,int end){
        int max=0;
        int i=0;
        while(i<=end){
            if(arr[max]<arr[i]){
                max=i;
            }
            i++;
        }
        return max;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
