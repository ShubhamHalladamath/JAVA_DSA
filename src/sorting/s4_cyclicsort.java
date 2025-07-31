package sorting;
//0,1,2,3,4 index
//1,2,3,4,5 values    arr[i]=i+1;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
                if(arr[i]==arr[arr[i]-1]){
                    continue;
                }
                i--;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(arr[i]);
                list.add(i+1);
                return list;
            }
        }
        return list;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
public class s4_cyclicsort {
    public static void main(String[] args) {
        int[] arr={4, 3, 6, 2, 1, 1};
        Solution s1=new Solution();
        System.out.println(s1.findTwoElement(arr));
//        cyclic(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
                if(arr[i]==arr[arr[i]-1]){
                    continue;
                }
                i--;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
