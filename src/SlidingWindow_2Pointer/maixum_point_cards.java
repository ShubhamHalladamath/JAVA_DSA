package SlidingWindow_2Pointer;

public class maixum_point_cards {
    public static void main(String[] args) {
        System.out.println(cards(new int[]{6,2,3,4,7,2,1,7},4));
    }
    public static int cards(int[] arr,int k){

       int  lsum=0;
       int rsum=0;
       int tsum=0;
       for(int j=0;j<k;j++){
           lsum=lsum+arr[j];
       }
        int i=1;
        while(k>0){
            tsum=Math.max(tsum,lsum+rsum);
            lsum=lsum-arr[k-1];
            rsum=rsum+arr[arr.length-i];
            i++;
            k=k-1;
        }
        return tsum;
    }
}
