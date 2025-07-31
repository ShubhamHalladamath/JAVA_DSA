package Dynamic_Programming.String_subsequence;

public class print_subsequence {
    public static void main(String[] args) {
        String text1="abcdeg";
        String text2="bdgekrg";
        int t1=text1.length(),t2=text2.length();

        String[][] dp=new String[t1+1][t2+1];

        for(int i=0;i<=t1;i++){
            dp[i][0]="";
        }
        for(int i=0;i<=t2;i++){
            dp[0][i]="";
        }
        for(int i=1;i<=t1;i++){
            for(int j=1;j<=t2;j++){
                dp[i][j]="";
            }
        }
        for(int i=1;i<=t1;i++){
            for(int j=1;j<=t2;j++){
                char c1=text1.charAt(i-1);
                char c2=text2.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1]+c1;
                }else{
                    String l=dp[i-1][j];
                    String r=dp[i][j-1];
                    if(l.length()>r.length()){
                        dp[i][j]=l;
                    }else{
                        dp[i][j]=r;
                    }
                }
            }
        }
        System.out.println(dp[t1][t2]);
    }
}
