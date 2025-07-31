package recurssion;

public class re9_count_0 {
    public static void main(String[] args) {
        System.out.println(count(10010));
    }
    static int check=0;
    static int count(int n){
        if (n == 0) {
            return check;
        }
        if((n%10)==0){
            check=check+1;
        }
        return count(n/10);
    }

}
