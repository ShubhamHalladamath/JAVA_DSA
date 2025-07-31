package recurssion;

import java.util.Arrays;

public class re8_palindrome {
    public static void main(String[] args) {
        int n=12321;
        palin(n);
        if(n==check){
            System.out.println("its a palindrome");
        }else{
            System.out.println("not a palindrome");
    }


    }
    static int check=0;
    static void palin(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        check=check*10+rem;
        palin(n/10);
    }
}
