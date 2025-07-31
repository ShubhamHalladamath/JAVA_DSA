package Stacks_Queues;

public class customqueue {
    protected int[] data;
    private static final int  DEFAULT_SIZE=10;
    protected int end=0;
    public customqueue(){
        this(DEFAULT_SIZE);
    }
    public customqueue(int size){
        this.data=new int[size];
    }
    public boolean insert(int value){
        if(isfull()){
            System.out.println(value+" can't be inserted Queue is full!!!");
            return false;
        }
        data[end++]=value;
        return true;
    }
    public int remove(){
        if(isempty()){
            System.out.println("Queue is empty!!!!");
            return -1;
        }
        int removed=data[0];
        for (int i = 0; i < end-1; i++) {
            data[i]=data[i+1];
        }
        end--;
       return data[0];
    }
    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

    private boolean isempty() {
        return end==0;
    }

    protected boolean isfull(){
        return end==data.length;
    }
}
