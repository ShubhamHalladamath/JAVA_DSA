package backtracking;

import java.util.ArrayList;

public class b1_maze_for_down_right {
    public static void main(String[] args) {
//        maze1("",3,3);
//        System.out.println(list);
        maze1("",3,3);


    }
//   1
    static int maze_count(String p,int row,int col){

        if(row==1 || col==1){
            return 1;
        }
       int left= maze_count(p+'D',row-1,col);
       int right = maze_count(p+'R',row,col-1);


        return left+right;
    }
//      2
    static ArrayList<String> list=new ArrayList<>();
    static void maze1(String p,int row,int col){

        if(row==1 || col==1){
            if(row==1&&col==1){
               list.add(p);
                return;
            }
            if(row==1){
                maze1(p+'R',row,col-1);
            }
            if(col==1){
                maze1(p+'D',row-1,col);
            }
            return;
        }
        maze1(p+'D',row-1,col);
        maze1(p+'R',row,col-1);


        return ;
    }
//    3
    static void maze2(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return ;
        }
        if(row>1){
            maze2(p+'d',row-1,col);
        }
        if(col>1){
            maze2(p+'r',row,col-1);
        }
    }
}
