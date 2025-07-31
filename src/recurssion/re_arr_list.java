package recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class re_arr_list {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4};
        System.out.println(times(arr,4,0));
    }
    static ArrayList<Integer> times(int[] arr, int target, int i){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(i==arr.length){
            return list;
        }
        if(target==arr[i]){
            list.add(i);
        }
        list.addAll(times(arr,target,i+1));
        return list;
    }
}
