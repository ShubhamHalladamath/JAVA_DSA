package recurssion;

import java.util.Arrays;

public class re_BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));
    }
    static int[] sort(int[] arr,int i,int n){
        if(n==0){
            return arr;
        }
       if(n==i){
           return arr;
       }

        if(arr[i]>arr[i+1]){
            swap(arr,i,i+1);
            sort(arr,i+1,n);
        } else{
            sort(arr,i+1,n);
        }
        sort(arr,0,n-1);
  return arr;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
