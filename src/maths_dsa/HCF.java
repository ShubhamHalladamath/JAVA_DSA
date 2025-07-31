package maths_dsa;

public class HCF {
    public static void main(String[] args) {
        int a=16;
        int b=12;
        System.out.println("HCF : "+gcd(a,b));
        System.out.println("LCM : "+(a*b)/gcd(a,b));

    }
    static int gcd(int a,int b){
        int rem;
        rem=b%a;
        if(rem==0){
            return a;
        }
        return gcd(rem,a);
    }
}
