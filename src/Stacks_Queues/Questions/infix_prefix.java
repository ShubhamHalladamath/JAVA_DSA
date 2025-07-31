package Stacks_Queues.Questions;

import java.util.Stack;

public class infix_prefix {
    public static void main(String[] args) {
        System.out.println(prefix( "(p^q)^(c^d)"));
    }
    public static String prefix(String str){
        Stack<Character> st=new Stack<>();
       String rev=reversed(str);
       String ans="";
        for (int i = 0; i < rev.length(); i++) {
            char ch=rev.charAt(i);
            if(ch>='A' && ch<='Z' || ch>'a' && ch<='z' || ch>='0' && ch<='9'){
                ans=ans+ch;
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans=ans+st.pop();
                }
                st.pop();
            }else{
//                if(ch=='^'){
//                    while(!st.isEmpty() && priority(ch)<=priority(st.peek())){
//                        ans=ans+ st.pop();
//                    }
//                }
                while(!st.isEmpty() && priority(ch)<priority(st.peek())){
                   ans=ans+st.pop();
                }
                st.push(ch);
            }


        }
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }

       return reversed(ans);
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
    public static String reversed(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('){
                rev=rev+')';
            }else if(str.charAt(i)==')'){
                rev=rev+'(';
            }else{
                rev=rev+str.charAt(i);
            }
        }
        return rev;
    }
    static String preToInfix(String str) {
        str=reversed(str);
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                String temp=ch+"";
                st.push(temp);
                ; }else{
                String second=st.pop();
                String first=st.pop();
                st.push("("+second+ch+first+")");
            }
        }
        String ans=st.pop();
        return ans;

    }
    static String postToPre(String str) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                st.push(ch+"");
            }else{
                String top1=st.pop();
                String top2=st.pop();
                st.push(ch+top2+top1);
            }
        }
        return st.pop();
    }
}
