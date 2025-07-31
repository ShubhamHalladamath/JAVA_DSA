package recurssion;

public class re2_BS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,9};
        int n=5;

        System.out.println(search(n,arr,0,arr.length-1));

    }
    static boolean search(int n,int[] arr,int start,int end){
        boolean ans=false;
        if (start > end) {
            ans=false;
            return ans;
        }

        int mid=(start+end)/2;
        if(n==arr[mid]){
            ans=true;
            return ans;
        }

        if(n<arr[mid]) {

            ans=search(n, arr, start, mid-1);


        }
        else {
            ans=search(n, arr, mid+1, end);
        }


        return ans;
    }
}
