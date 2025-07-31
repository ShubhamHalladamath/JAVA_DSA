package Dynamic_Programming.String_subsequence;
//https://leetcode.com/problems/longest-common-subsequence/description/
public class general_rule {
    public static void main(String[] args) {
        System.out.println("longest subsequence");
    }
//    tabular
    public int longestCommonSubsequence(String s1, String s2) {
        int t1=s1.length();
        int t2=s2.length();
        int[][] dp=new int[t1][t2];
        for (int i = 0; i < t2; i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                dp[0][i] = 1;
            } else if (i > 0) {
                dp[0][i] = dp[0][i - 1]; // carry over the previous value
            }
        }
        for (int i = 1; i < t1; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = dp[i - 1][0]; // carry over the previous value
            }
        }
        for(int i=1;i<t1;i++){
            for(int j=1;j<t2;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int shrink_i1=(i-1>=0)?dp[i-1][j]:0;
                    int shrink_i2=(j-1>=0)?dp[i][j-1]:0;
                    dp[i][j]=Math.max(shrink_i1,shrink_i2);
                }
            }
        }
        return dp[t1-1][t2-1];
    }
//    reccurssion
    private static int solve(String s1,String s2,int i1,int i2,int[][] dp){
        if(i1<0 || i2<0){
            return 0;
        }
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        // for mathching characters
        if(s1.charAt(i1)==s2.charAt(i2)){
            return 1+solve(s1,s2,i1-1,i2-1,dp);
        }
        // for not matching characters (2 possibilities)
        int shrink_i1=solve(s1,s2,i1-1,i2,dp);
        int shrink_i2=solve(s1,s2,i1,i2-1,dp);
        return dp[i1][i2]=Math.max(shrink_i1,shrink_i2);
    }

}
