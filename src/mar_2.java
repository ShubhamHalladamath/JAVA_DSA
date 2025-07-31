public class mar_2 {
    public static void main(String[] args) {
        System.out.println(helper());
    }
    static String helper() {
        String ans = "11122223";
        String temp = "";

        for (int i = 0; i < ans.length(); i++) {
            int count = 1;
            char ch = ans.charAt(i);
            boolean inside=true;
            for (int j = i + 1; j < ans.length(); j++) {
                char ch2 = ans.charAt(j);
                if (ch == ch2) {
                    count++;
                 }else{
                    i = j-1;
                    inside=false;
                    break;
                }
             }
            if(inside) i=ans.length()-1;

            temp = temp + count + ch;
        }
        return temp;
    }
}
