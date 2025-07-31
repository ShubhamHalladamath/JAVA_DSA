package Stacks_Queues.Questions;
import java.util.Stack;
public class infix_postfix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b/c^d/e"));
    }
    public static String infixToPostfix(String exp) {
        String ans="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ans=ans+ch;
            }
//            checking whether ch='('
            else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
//                poping stack until '(' this ch occurrs after getting again pop
                while(!st.isEmpty() && st.peek()!='(' ){
                    ans=ans+st.pop();
                }
                st.pop();
            }else{
//                if ch==operator then check priority(ch)>prioritty peek of the stack then while loop break;or till the stack become empty
                while(!st.isEmpty() && priority(ch)<=priority(st.peek())){
                    ans=ans+st.pop();
                }
                st.push(ch);
            }
        }
// if any operator is remaining in  stack then pop it to the main ans
        while(!st.isEmpty()){
            if (st.peek() == '(')
                return "Invalid Expression";
            ans=ans+st.pop();
        }
        return ans;

    }
    public static int priority(char ch){
        if(ch=='^'){
            return 3;
        }
        if(ch=='/' || ch=='*'){
            return 2;
        }
        if(ch=='+' || ch=='-'){
            return 1;
        }
        return -1;
    }
    static String postToInfix(String str) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                String temp=ch+"";
                st.push(temp);
            }else{
                String second=st.pop();
                String first=st.pop();
                st.push("("+first+ch+second+")");
            }
        }
        String ans=st.pop();
        return ans;
    }
    static String preToPost(String str) {
        Stack<String> st=new Stack<>();
        str=reverse(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                st.push(ch+"");
            }else{
                String top1=st.pop();
                String top2=st.pop();
                st.push(top1+top2+ch);
            }
        }
        return st.pop();
    }
    static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans=ans+str.charAt(i);
        }
        return ans;
    }
}
