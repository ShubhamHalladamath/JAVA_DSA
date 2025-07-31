package Stacks_Queues;

public class customstack {
    protected int[] arr;
    protected int ptr=0;
    protected static final int DEFAULT_SIZE=10;
    public customstack(){
        this(DEFAULT_SIZE);
    }
    public customstack(int size){
        this.arr=new int[size];
    }
    public boolean push(int value){
        if(isfull()){
            System.out.println(+ value +" can't be inserted stack is full!!!!");
            return false;
        }
        arr[ptr++]=value;

        return true;
    }
    protected boolean isfull(){
        return ptr==arr.length;
    }
    public int pop(){
        if(isempty(ptr)){
            System.out.println("stack is empty!!!");
            return -1;
        }
        int removed=arr[ptr-1];
        ptr--;
        return removed;
    }
    public void peek(){
        if(isempty(ptr)){
            System.out.println("no element exist in stack");

            return ;
        }
        System.out.println(arr[ptr-1]);
        return ;
    }
    private boolean isempty(int ptr){
        return ptr==0;
    }
    public void display(){
        for (int i = 0; i <ptr; i++) {
            System.out.print(arr[i]+"->");
        }
        System.out.println("END");
    }

}
