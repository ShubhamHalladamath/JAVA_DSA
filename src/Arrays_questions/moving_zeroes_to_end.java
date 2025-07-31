package Arrays_questions;
//leetcode 283
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Input: nums = [0]
//        Output: [0]
import java.util.Arrays;

public class moving_zeroes_to_end {
    public static void main(String[] args) {
        int nums[]={0,2,0,4,0,67};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int j=0;
        while(j!=count){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==0){
                    swap(nums,i,i+1);
                }
            }
            j++;
        }
    }
   public static void  swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
