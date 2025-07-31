package Algorithams;

public class Divide_conquor {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,5,6,7,8};
        System.out.println(find(arr,0,arr.length-1));
    }
    static int find(int[] arr,int i,int j){
        if(i==j){
            return arr[i];
        }
        if(j==i+1){
            return Math.max(arr[i],arr[j]);
        }
        int leftmax=find(arr,i,(i+j)/2);
        int rightmax=find(arr,(i+j)/2,j);
        return Math.max(leftmax,rightmax);
    }
//    Given an integer array nums, find the subarray with the largest sum, and return its sum.
    public static int maxSubArray(int[] arr) {
        return helper(arr,0,arr.length-1);
    }
    static int helper(int[] arr,int i,int j){
        if(i==j){
            return arr[i];
        }
        int mid=(i+j)/2;
        int left=helper(arr,i,mid);
        int right=helper(arr,mid+1,j);
        int leftsum=0;
        for(int a=0;a<=mid;a++){
            leftsum=leftsum+arr[a];
        }
        int rightsum=0;
        for(int a=mid+1;a<=j;a++){
            rightsum=rightsum+arr[a];
        }
        int max=Math.max(left,right);

        return Math.max(max,leftsum+rightsum);
    }
}
