package Stacks_Queues.Questions;
import java.io.PrintStream;
import java.util.*;
public class k_digits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1111111",3));
    }
    public static String removeKdigits(String s, int k) {

        if(k>=s.length()){
            return "0";
        }
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            while(k!=0 && !st.isEmpty() && Integer.valueOf(st.peek())>Integer.valueOf(s.charAt(i))){
                 st.pop();
                 k--;
            }
            st.push(s.charAt(i));

        }
        System.out.println(st);
        System.out.println(k);
        while(k!=0){
            st.pop();
            k--;
        }
        System.out.println(st);
        String temp="";
      while(!st.isEmpty()) {
          temp = temp + st.pop();
      }


        temp=new StringBuilder(temp).reverse().toString();


        int p=0;
      while(p<temp.length() && (temp.charAt(p)+"").equals("0")){
          p++;
       }

       temp= temp.substring(p,temp.length());
      if(temp.length()==0){
          return "0";
      }
      return temp;
   }
}
