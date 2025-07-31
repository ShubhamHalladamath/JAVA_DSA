package Heaps;
import java.util.*;
class Solution
{
//    (a,b)->Integer.compare(a[0],b[0]) lambda function used when multiple elements passed in priority queue
    //Function to merge k sorted arrays.
    public ArrayList<Integer> mergeKArrays(int[][] arr,int K)
    {
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<arr.length;i++){
            p.add(new int[]{arr[i][0],i,0});
        }
        while(!p.isEmpty()){
            int[] removed=p.poll();
            list.add(removed[0]);
            int a=removed[1];
            int b=removed[2];
            if(b+1<arr.length){
                p.add(new int[]{arr[a][b+1],a,b+1});
            }
        }

        return list;
    }

}
public class sort{
    public static void main(String[] args) {

    }
}