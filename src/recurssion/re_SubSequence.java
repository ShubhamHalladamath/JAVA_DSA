package recurssion;

import java.util.ArrayList;

public class re_SubSequence {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list=subseq2("","abc");
        System.out.println(list);
    }
    static ArrayList<String> subseq(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1),list);
        subseq(p,up.substring(1),list);
     return list;
    }
    static ArrayList<String> list1=new ArrayList<>();
    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            list1.add(p);
            return list1;
        }
        char ch=up.charAt(0);
        subseq2(p+ch,up.substring(1));
        subseq2(p,up.substring(1));
        return list1;
    }
}
