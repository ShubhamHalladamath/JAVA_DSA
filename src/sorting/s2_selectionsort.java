package sorting;
//concept find the max in arr and swap at last
import java.util.Arrays;

public class s2_selectionsort {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1,-999};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] arr){
        for (int i = 0; i<arr.length ; i++) {
            int end=arr.length-i-1;
            int index=max(arr,end);
            swap(arr,index,end);

        }


    }
    static int max(int[] arr,int end){
        int ans=arr[0];
        int index=0;
        for (int i = 0; i <=end ; i++) {
            if(ans<arr[i]){
                ans=arr[i];
                index=i;

            }
        }
        return index;
    }
    static void swap(int[] arr,int start,int end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
}
}
