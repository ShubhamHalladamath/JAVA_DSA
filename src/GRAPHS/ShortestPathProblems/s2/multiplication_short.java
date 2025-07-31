package GRAPHS.ShortestPathProblems.s2;
import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int a,int b){
        this.first=a;
        this.second=b;
    }
}
class Solution {
    final int mod=100000;
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->Integer.compare(b.first,a.first));
        q.add(new Pair(start,1));
        int steps=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair removed=q.poll();
                for(int j:arr){

                    int temp=operation(removed.first*j);
                    if(temp<end){
                        q.add(new Pair(temp,removed.second+1));
                    }else if(temp==end){
                        return removed.second;
                    }
                }
            }
        }
        return -1;
    }
    private int operation(int a){
        return a % mod;
    }
}
public class multiplication_short {
    public static void main(String[] args) {
        int[] arr={3,4,65};
        System.out.println(new Solution().minimumMultiplications(arr,7,66175));
    }
}
