package sorting;

import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
//        System.out.println(missingNumber(new int[]{0,1,2}));
        System.out.println(helper3(new int[]{1,2,4,4,4,4,4,6},4));
    }
    static int helper2(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target || (start == end)){

                if(start==end){
                    if(nums[mid]==target){
                        return mid;
                    }
                    return start+1;
                }else{
                    end=mid;
                }
            }else  if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

    }
        return -1;
    }
    static int helper3(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target || (start == end)){

                if(start==end){
                    if(nums[mid]==target){
                        return mid;
                    }
                    return start-1;
                }else{
                    start=mid+1;
                }
            } else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return -1;
    }
}

//    static int missingNumber(int[] nums) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=i){
//                if(nums[i]<=nums.length-1){
//                    int temp=nums[nums[i]];
//                    nums[nums[i]]=nums[i];
//                    nums[i]=temp;
//                    i--;
//                }
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=i){
//                return i;
//            }
//        }
//        return nums.length;
//    }


