package recurssion;

public class re6_sum_digits {
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    static int sum(int n){
        int rem=0;
        if(n==0){
            return 0;
        }
        rem=n%10;
        n=n/10;
        return rem+sum(n);
    }
}
