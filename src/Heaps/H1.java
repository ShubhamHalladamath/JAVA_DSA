package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        int[] arr={43,36,78,100,23,3,6};
        list=new ArrayList<>();

        System.out.println("minheap:"+minheap(arr));
        System.out.println("maxheap:"+maxheap(arr));

    }
    public static int minheap(int[] arr){
        int[] ans=new int[20];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
            int j=i;
            while((j-1)/2>=0){
                if(ans[j]<ans[(j-1)/2]){
                    int temp=ans[j];
                    ans[j]=ans[(j-1)/2];
                    ans[(j-1)/2]=temp;
                    j=(j-1)/2;
                }else{
                    break;
                }
            }
        }
        int[] result=Arrays.copyOfRange(ans,0,arr.length);
        System.out.println(Arrays.toString(result));
       return ans[0];
    }
    public static int maxheap(int[] arr){
        int[] ans=new int[20];
        for (int i = 0; i < arr.length; i++) {
            ans[i+1]=arr[i];
            int j=i+1;
            while(j/2>=1){
                if(ans[j]>ans[j/2]){
                    int temp=ans[j];
                    ans[j]=ans[j/2];
                    ans[j/2]=temp;
                    j=j/2;
                }else{
                    break;
                }
            }
        }
        return ans[1];
    }
}

