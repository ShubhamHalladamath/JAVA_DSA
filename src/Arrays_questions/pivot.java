package Arrays_questions;

import java.util.Arrays;

public class pivot {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}));
       
    }
    public static int search(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[start]<=nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return nums.length-1;
    }
}
