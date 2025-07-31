package GRAPHS.DisJointSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Islands2{
    public int[] numOfIslands(int m, int n, ArrayList<int[]> queries){
        int[] ans=new int[queries.size()];
        boolean[][] visited=new boolean[m][n];
        DisJoint d=new DisJoint(m*n);
        int index=0;
        int cnt=0;
        for(int[] i:queries){
            int a=formula(n,i[0],i[1]);
            if(visited[i[0]][i[1]]){
                ans[index++]=cnt;
                continue ;
            }
            visited[i[0]][i[1]]=true;
            cnt++;
            ans[index]=cnt;
            int[] dirR={-1,0,1,0};
            int[] dirC={0,1,0,-1};
            for(int j=0;j<4;j++){
                int newr=i[0]+dirR[j];
                int newc=i[1]+dirC[j];
                if(newr>=0 && newc>=0 && newr<m && newc<n && visited[newr][newc] &&
                        d.findP(formula(n,newr,newc))!=d.findP(a)){
                    d.unionByRank(formula(n,newr,newc),a);
                    cnt--;
                }
            }
            ans[index++]=cnt;
        }
        return ans;
    }
    private int formula(int n,int r,int c){
        return r*n+c;
    }
}
public class Striver_g51 {
    public static void main(String[] args) {
//        Problem Statement: You are given an n, m which means the row and column of the 2D matrix,
//        and an array of size k denoting the number of operations. Matrix elements are 0 if there is
//        water or 1 if there is land. Originally, the 2D matrix is all 0 which means there is no land
//        in the matrix. The array has k operator(s) and each operator has two integers A[i][0], A[i][1]
//        means that you can change the cell matrix[A[i][0]][A[i][1]] from sea to island.
//        Return how many islands are there in the matrix after each operation.
//        You need to return an array of size k.
        ArrayList<int[]> operations=new ArrayList<>();
        operations.add(new int[]{0,0});
        operations.add(new int[]{0,0});
        operations.add(new int[]{1,1});
        operations.add(new int[]{1,0});
        operations.add(new int[]{0,1});
        operations.add(new int[]{0,3});
        operations.add(new int[]{1,3});
        operations.add(new int[]{0,4});
        operations.add(new int[]{3,2});
        operations.add(new int[]{2,2});
        operations.add(new int[]{1,2});
        operations.add(new int[]{0,2});
        System.out.println(Arrays.toString(new Islands2().numOfIslands(4,5,operations)));
    }
}
