package SlidingWindow_2Pointer;
import java.util.ArrayList;
public class union {
    public static void main(String[] args) {
        System.out.println(findUnion(new int[]{1,2,3,4,5},new int[]{1,2,3}));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int p=0;
        int q=0;
        while(p<a.length && q<b.length){
            if(a[p]<b[q]){
                if(list.isEmpty()){
                    list.add(a[p]);
                    p++;
                }else{
                    if(list.get(list.size()-1)==a[p]){
                        p++;
                    }else{
                        list.add(a[p]);
                        p++;
                    }
                }
            }else{
                if(list.isEmpty()){
                    list.add(b[q]);
                    q++;
                }else{
                    if(list.get(list.size()-1)==b[q]){
                        q++;
                    }else{
                        list.add(b[q]);
                        q++;
                    }
                }
            }
        }
            System.out.println("p"+p);
            System.out.println("q"+q);
            System.out.println(list);
            while(p<a.length){
                if(list.get(list.size()-1)==a[p]){
                    p++;
                }else{
                    list.add(a[p]);
                    p++;
                }}
            while(q<b.length){
                if(list.get(list.size()-1)==b[q]){
                    q++;
                }else{
                    list.add(b[q]);
                    q++;
                }
            }
        return list;
        }

    }

