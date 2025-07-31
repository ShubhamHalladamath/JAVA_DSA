package searching;

public class s2_search_in_rotated_sorted_array {
    public static void main(String[] args) {
       int[] arr={1}; 
        System.out.println(search(arr,1));

    }
    static int search(int[] nums, int target) {
        int pivot=piv(nums);
        int left=binarysearch(nums,0,pivot,target);
        int right=binarysearch(nums,pivot+1,nums.length-1,target);
        if(left==-1 && right==-1){
            return -1;
        }else{
            if(left==-1){
                return right;
            }else{
                return left;
            }
        }
    }
    static int piv(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]==nums[end]){
                return start;
            }
            if(nums[start]<nums[mid]){
                start=mid;
            } else{
                end=mid;
            }

        }
        return -1;

    }
    static int binarysearch(int[] nums,int s,int e,int target){
        while(s<=e){
            int mid=(s+e)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return 0;
    }

}
