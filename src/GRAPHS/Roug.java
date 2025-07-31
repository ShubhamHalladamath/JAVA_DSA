package GRAPHS;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Roug {
    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                mat[i][j]=cal(6,i,j);
                int a = getRow(6,mat[i][j]);
                int b = getCol(6,a,mat[i][j]);
               if(a!=i || b!=j) {
                   System.out.println("error");
                   break;
               }
            }
        }
        for(int i=0;i<6;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
    private static int cal(int n,int r,int c){
        if(r % 2 == 0){
            return  (n*n - n*r - c);
        }
        return (n*n - n*r - (n-c-1));
    }
    private static int getCol(int n,int r,int no){
        if(r % 2 == 0){
            return (n*n - n*r - no);
        }
        return -(n*n - n*r - n +1 -no);
    }
    private static int getRow(int n,int no){
        return n-((no-1)/n)-1;
    }
}
