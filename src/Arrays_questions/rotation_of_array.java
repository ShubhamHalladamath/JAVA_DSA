package Arrays_questions;

import java.util.Arrays;

//leetcode 189 left rotation
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class rotation_of_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=4;
        k=k%arr.length;
//        reverse left array
        reverse(arr,0,k-1);
//        reverse right
        reverse(arr,k,arr.length-1);
//        reverse whole array
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int a,int b){
        if(a==b) return ;
        int i=a;
        int j=b;
        while(i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            if(j==i+1){
                return ;
            }
            i++;
            j--;
        }
    }
}
