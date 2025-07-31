package recurssion;

import java.util.ArrayList;

public class re_arrays {
    public static void main(String[] args) {
        int[] arr={1,4,3,5,4,100};
        ArrayList<Integer> list=new ArrayList<Integer>();

        System.out.println(times(arr,4,0,list));
    }
    static boolean sort(int[] arr,int i){
        if(i==arr.length){
            return true;
        }
        return (arr[i]<arr[i+1]) && sort(arr,i+1);
    }
    static boolean search(int[] arr,int i,int k){

        if(i==arr.length){
            return false;
        }
        return (arr[i]==k) || search(arr,i+1,k);
    }
    static ArrayList<Integer> times(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(target==arr[i]){
            list.add(i);
        }
            times(arr,target,i+1,list);

        return list;
    }
}
