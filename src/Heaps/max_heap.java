package Heaps;

import java.util.Arrays;

class MaxHeap{
    int[] arr;
    int capacity;
    int s=0;
    MaxHeap(int capacity){
        this.arr=new int[capacity];
    }
    private int Parent(int i){
        return (i-1)/2;
    }
    private int leftchild(int i){
        return 2*i+1;
    }
    private int rightchild(int i){
        return 2*i+2;
    }
    public int maxValue(){
        return arr[0];
    }
    public void insert(int k){
        arr[s++]=k;
        upheap(s-1);
    }
    public int delete(){
        if(s==0){
            System.out.println("heap is empty");
            return -1;
        }
        int removed=arr[0];
        arr[0]=arr[s-1];
        s--;
        downheap(0);
        return removed;
    }
    private void upheap(int i){
        if(i==0){
            return ;
        }
        int par=Parent(i);
        if(arr[i]>arr[par]){
            swap(i,par);
            upheap(par);
        }
    }
    private void downheap(int i){
        int max=i;
        int left = leftchild(i);
        int right= rightchild(i);
        if(left<s && arr[left]>arr[max]){
            max=left;
        }
        if(right<s && arr[right]>arr[max]){
            max=right;
        }
        if(i!=max){
            swap(i,max);
            downheap(max);
        }
    }
    public void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void display(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,s)));
    }

}
public class max_heap {
    public static void main(String[] args) {
        MaxHeap h=new MaxHeap(10);
        h.insert(1);
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.display();

    }
}
