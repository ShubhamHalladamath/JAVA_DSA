package sorting;

import java.util.Arrays;

public class s1_bubblesort {
    public static void main(String[] args) {
        int[] arr={5,4,0,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]<arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }

            }

        }
    }
}
