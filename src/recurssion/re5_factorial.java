package recurssion;

public class re5_factorial {
    public static void main(String[] args) {
        System.out.println(fact(1));
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
