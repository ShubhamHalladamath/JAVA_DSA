package Stacks_Queues;

public class dynamicstack extends customstack {
     public dynamicstack(){
         super();
     }
     public dynamicstack(int size){
         super(size);
     }
     @Override
     public boolean push(int value){
         if(isfull()){
             int[] temp=new int[arr.length*2];
             for (int i = 0; i <arr.length ; i++) {
                 temp[i]=arr[i];
             }
             arr=temp;
         }

         return super.push(value);
     }
}
