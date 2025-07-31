package Stacks_Queues;

public class dynamicqueue extends customqueue{
    dynamicqueue(){
        super();
    }
    dynamicqueue(int size){
        super(size);
    }
    public boolean insert(int value){
        if(isfull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<super.end;i++){
                temp[i]=data[i];
            }
            data=temp;
        }

        return super.insert(value);
    }
    
}
