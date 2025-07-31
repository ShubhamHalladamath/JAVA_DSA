package sorting;
//concept insertion means swapping the numbers to left side of a j pointer when i=0, j starts from i+1
import java.util.Arrays;

public class s3_insertion {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
