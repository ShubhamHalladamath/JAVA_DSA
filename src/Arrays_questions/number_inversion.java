package Arrays_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class number_inversion {
    public static int count=0;
    public static void main(String[] args) {
        int[] arr={10, 10, 10};
        System.out.println(Arrays.toString(merge_sort(arr)));
        System.out.println("ans : "+count);
    }
    static int[] merge_sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left= merge_sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
   static int[] merge(int[] left,int[] right){
        int[] ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                ans[k]=left[i];
                k++;
                i++;
            }else{
                ans[k]=right[j];
                count=count+(left.length-i);
                k++;
                j++;
            }
        }
        while(i<left.length){
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;
   }
}
