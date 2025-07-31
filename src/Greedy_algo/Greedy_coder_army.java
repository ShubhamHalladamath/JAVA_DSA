package Greedy_algo;
import java.util.*;
class Solution_Army{
    //   1     https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
    static List<Integer> minPartition(int n)
    {

        // code here
        List<Integer> ans=new ArrayList<>();
        int[] notes={2000,500,200,100,50,20,10,5,2,1};
        for(int i:notes){
            if(i>n) continue;

            int a = n/i;
            for(int j=0;j<a;j++){
                ans.add(i);
            }
            n=n-(i*a);

        }
        return ans;
    }
//     2   https://www.geeksforgeeks.org/problems/shop-in-candy-store1145/1
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        Arrays.sort(candies);
        int min=Minimum(candies,N,K);
        int max=Maximum(candies,N,K);
        return new ArrayList<>(Arrays.asList(min,max));
    }
    static int Minimum(int[] nums,int n,int k){
        int left = 0;
        int right=n-1;
        int cost=0;
        while(left<=right){
            cost+=nums[left++];
            right-=k;
        }
        return cost;
    }
    static int Maximum(int[] nums,int n,int k){
        int left = 0;
        int right=n-1;
        int cost=0;
        while(left<=right){
            cost+=nums[right--];
            left+=k;

        }
        return cost;
    }
}
public class Greedy_coder_army {
    public static void main(String[] args) {

    }
}
