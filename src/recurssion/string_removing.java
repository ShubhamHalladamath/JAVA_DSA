package recurssion;

public class string_removing {
    public static void main(String[] args) {
    String name="abcapplevinegar";

        System.out.println(skipApple(name,""));


    }
    static String temp="";
    static String remove(String str,int i){
        if(i==str.length()){

            return str;
        }
        if(str.charAt(i)!='a'){
            temp=temp+str.charAt(i);
        }
        remove(str,i+1);
       return temp;
    }
    static String remove1(String str,String dub){
        if(str.isEmpty()){
//            System.out.println(dub);
            return dub;
        }
        char ch=str.charAt(0);
        if(ch=='a'){

           return  remove1(str.substring(1),dub);
        }else{

            return remove1(str.substring(1),dub+ch);
        }

    }
    static String skipApple(String str,String dub){
        if(str.isEmpty()){

            return dub;
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5),dub);
        }
        else{
            char ch=str.charAt(0);
            return skipApple(str.substring(1),dub+ch);

        }
    }


}
