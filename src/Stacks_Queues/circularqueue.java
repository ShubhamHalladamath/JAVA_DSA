package Stacks_Queues;

public class circularqueue {
    protected int[] data;
    protected final static  int DEFAULT_SIZE=10;
    protected int size;
    protected int front=0;
    protected int end=0;
    public circularqueue(){
        this(DEFAULT_SIZE);
    }
    public circularqueue(int size){
        this.data=new int[size];
    }
    protected boolean isfull(){
        return size==data.length;
    }
    protected boolean isempty(){
        return size==0;
    }
    public boolean insert(int value){
        if(isfull()){
            System.out.println(value+" can't be inserted queue is full");
            return false;
        }
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove(){
        if(isempty()){
            System.out.println("queue is empty!!!! ");
            return -1;
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public void display(){
        int i=front;
        do{
            System.out.print(data[i]+" <- ");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.println("END");
    }


}
