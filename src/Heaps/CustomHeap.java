package Heaps;

import java.util.ArrayList;
import java.util.List;
//considering root as index 1;
public class CustomHeap<T extends Comparable<T>> {
    public List<T> list;
    CustomHeap (){
        list=new ArrayList<>();
    }
    public int parent(int index){
        return (index-1)/2;
    }
    public List<T> getheap(){
        return list;
    }
    public int left(int index){
        return index*2+1;
    }
    public int right(int index){
        return index*2+2;
    }
    public void swap(int a,int b){
        T temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }
    public void upheap(int index){
        if(index==0){
            return ;
        }
        int p=parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
          swap(p,index);
          upheap(p);
        }
    }
    public T remove(){
        if(list.isEmpty()){
            System.out.println("list is empty");
        }
        T temp=list.get(0);
        T removed=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,removed);
            downheap(0);
        }
        return temp;
    }
    public void downheap(int index){
       int min=index;
       int left=left(index);
       int right=right(index);
       if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
           min=left;
       }
       if(right<list.size() && list.get(min).compareTo(list.get(right))>0){
           min=right;
       }
       if(min!=index){
           swap(min,index);
           downheap(min);
       }
    }
    ArrayList<T> heapsort(){
        ArrayList<T> ans=new ArrayList<>();
        while(!list.isEmpty()){
            ans.add(this.remove());
        }
        return ans;
    }
}
