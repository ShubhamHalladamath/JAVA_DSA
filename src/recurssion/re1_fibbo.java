package recurssion;
// fibonacci number using recurssion-------------------------------------
import java.util.Scanner;

public class re1_fibbo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans =fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        int ans=-1;

        if(n<2){
            return n;
        }
        ans=fibo(n-1)+fibo(n-2);
        return ans;
    }
}
