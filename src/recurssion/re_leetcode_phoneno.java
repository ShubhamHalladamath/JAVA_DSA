package recurssion;

import java.util.ArrayList;

public class re_leetcode_phoneno {
    public static void main(String[] args) {
          phonepad("","2");
        System.out.println(list);
    }
    static ArrayList<String> list=new ArrayList<>();
    static ArrayList<String> phonepad(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        for (int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch=(char)('a'+i);
            phonepad(p+ch,up.substring(1));
        }

       return list;
    }
}
