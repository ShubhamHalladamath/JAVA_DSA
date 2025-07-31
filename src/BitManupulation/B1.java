package BitManupulation;

public class B1 {
    public static void main(String[] args) {

    }
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int temp=(int)Math.pow(2,k);
        return ((n & temp) == temp)?true:false;
    }
    static void bitManipulation(int num, int a) {
        // code here
        int get=0,set=0,clear=0;
        int temp=1<<a-1;
        int p=num & temp;
        if(p!=0){
            get=1;
            set=num;
            clear=num-(int)Math.pow(2,a-1);
        }else{
            get=0;
            set=num+(int)Math.pow(2,a-1);
            clear=num;
        }
        System.out.print(get + " " + set + " ");
        System.out.print(clear);


    }
}
