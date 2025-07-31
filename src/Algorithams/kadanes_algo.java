package Algorithams;

public class kadanes_algo {
    public static void main(String[] args) {
        int[] arr={5,4,-1,-2};
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        int sum=0;
        int fsum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>fsum){
                    fsum=sum;
                }
            }
        }
        return fsum;
    }
}
