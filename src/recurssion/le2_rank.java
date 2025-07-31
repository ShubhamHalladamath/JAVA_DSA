package recurssion;

import java.util.Arrays;

public class le2_rank {
    public static void main(String[] args) {
          int[] arr={37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int[] temp=new int[arr.length];
        int[] ans=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<arr.length;i++){
            ans[i]=counting(temp,arr[i]);
        }

        return ans;
    }
    static int counting(int[] temp,int target){
        int count=0;
        int i=0;
        int dub=temp[0];
        while(i<temp.length){
            if(dub==temp[i] && i!=0){
                count--;
            }

            if(temp[i]<=target){
                count=count+1;
                dub=temp[i];
            }
            i++;

        }
        return count;
    }
}
