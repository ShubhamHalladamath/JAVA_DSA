package backtracking;

import java.util.Arrays;

public class b4_allpath {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        backtracking("",board,0,0);
        for (boolean[] i:board) {
            System.out.println(Arrays.toString(i));

        }
    }
    static void backtracking(String p, boolean[][] board, int row, int col){
        if(row== board.length-1 && col==board[0].length-1){
            board[row][col]=false;
            System.out.println(p);
//            System.out.println("the path is followed by false key");
//            display(board);
            return ;
        }
        if(!board[row][col]){
            return;
        }
//        while entering into the each row and coloum we change true to false;
        board[row][col]=false;

        if(row<board.length-1){
            backtracking(p+'D',board,row+1,col);
        }
        if(col<board[0].length-1){
            backtracking(p+'R',board,row,col+1);
        }
        if(row>0){
            backtracking(p+'U',board,row-1,col);
        }
        if(col>0){
            backtracking(p+'L',board,row,col-1);
        }
//        after ending function call we change false to true again;
        board[row][col]=true;
    }
//    static void display(boolean[][] mat){
//        for(boolean[] row:mat){
//            System.out.println(Arrays.toString(row));
//        }
//    }
}
