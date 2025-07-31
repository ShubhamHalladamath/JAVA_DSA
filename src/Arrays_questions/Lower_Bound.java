package Arrays_questions;

public class Lower_Bound {
    public static void main(String[] args) {
           int[] arr={1,3,4,5,5,7,9,10,11};
        System.out.println(LB(arr,6));
    }
    public static int LB(int[] arr,int k){
        int start=0;
        int end=arr.length-1;
        int ans=end+1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=k){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
