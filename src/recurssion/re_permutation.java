package recurssion;

import java.util.ArrayList;

public class re_permutation {
    public static void main(String[] args) {
        String name="abc";
        System.out.println(per("",name));

    }

    static ArrayList<String> strlist=new ArrayList<>();
    static ArrayList<String> per(String p,String up){
        if(up.isEmpty()){

            strlist.add(p);
            return strlist;
        }
        char ch=up.charAt(0);
        int l=p.length();
        for (int i = 0; i <=l ; i++) {
//            int substring(a,b) a is inclusive and b is exclusive...........if a=b then it returns empty string;
          String f=p.substring(0,i);
          String e=p.substring(i,l);
          per(f+ch+e,up.substring(1));

        }
        return strlist;
    }
    static int percnt(String p,String up){

        if(up.isEmpty()){

            return 1;
        }
        char ch=up.charAt(0);
        int l=p.length();
        int count=0;
        for (int i = 0; i <l ; i++) {
//            int substring(a,b) a is inclusive and b is exclusive...........if a=b then it returns empty string;
            String f=p.substring(0,i);
            String e=p.substring(i+1,l);
            count =count+percnt(f+ch+e,up.substring(1));

        }
        return count;
    }
}
