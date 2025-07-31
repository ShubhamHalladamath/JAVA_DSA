package backtracking;

import java.util.ArrayList;

public class b2_maze_for_down_diagonal_right {
    public static void main(String[] args) {
        System.out.println(maze_count(3,3));
        maze_path("",3,3);
        System.out.println(list);
    }
//    1
    static int maze_count(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int down=maze_count(row-1,col);
        int diagonal=maze_count(row-1,col-1);
        int right=maze_count(row,col-1);

        return down+diagonal+right;
    }
//    2
    static ArrayList<String> list=new ArrayList<>();
    static void maze_path(String p,int row,int col){
        if(row==1||col==1){
            if(row==1&&col==1){
                list.add(p);
                return;
            }
            if(row==1){
                maze_path(p+'R',row,col-1);
            }
            if (col == 1) {
                maze_path(p+'D',row-1,col);
            }

            return ;
        }
       maze_path(p+'D',row-1,col);
        maze_path(p+'T',row-1,col-1);
        maze_path(p+'R',row,col-1);

        return ;
    }
//    3 for same question
}
