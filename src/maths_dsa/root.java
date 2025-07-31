package maths_dsa;

public class root {
    public static void main(String[] args) {
        System.out.println(root(50));
    }
    static int root(int n){
        int start=1;
        int end=n;

        while(start<=end){

            int mid=(start+end)/2;
            if(mid*mid==n){

                return mid;
            }
             if(mid * mid < n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(end==start+1){
                return start;
            }

        }
        return end;
    }
}
