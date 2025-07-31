package sorting;

import java.util.Arrays;

public class s6_quicksort {
    public static void main(String[] args) {
      int[] arr={100,99,88};

      sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int unique(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i-1>=0){
                if(arr[i]==arr[i-1]) continue;
            }
            if( i+1 <arr.length){
                if(arr[i]==arr[i+1]) continue;
            }
            return arr[i];
        }
        return -1;
    }
    static void sort(int[] arr,int low,int hi){
        if(low>=hi){
            return ;
        }
        int start=low;
        int end=hi;
        int mid=(start+end)/2;
        int p=arr[mid];
        while(start<=end){
            while (arr[start]<p){
                start++;
            }
            while(arr[end]>p){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
//        after this step pivot will be at correct place:...............start=index(p)+1,end=index(p)-1
        sort(arr,low,end);
        sort(arr,start,hi);

    }
}
