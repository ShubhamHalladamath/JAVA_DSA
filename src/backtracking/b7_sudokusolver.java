package backtracking;

import java.util.Arrays;

public class b7_sudokusolver {
    public static void main(String[] args) {
        int[][] board={
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solve(board,0,0);
        for (int i = 0; i < board.length ; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    static void solve(int[][] board ,int row,int col){
//        boolean isempty=true;
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 if(board[i][j]==0){
//                     row=i;
//                     col=j;
//                     isempty=false;
//                     break;
//                 }
//             }
//             if(isempty==false){
//                 break;
//             }
//         }
//      downside if is enf of the solve function call that is base condition;
//         if(isempty==true){
//             return ;
//         }
        if(row==board.length && col==board.length){
            return ;
        }
        if(col==board.length){
            solve(board,row+1,0);
        }

        boolean empty=false;
        if(board[row][col]==0){
            empty=true;
        } else{
            solve(board,row,col+1);
        }
      if(empty==true) {
          for (int i = 1; i <= 9; i++) {
              if (issafe(board, row, col, i)) {
                  board[row][col] = i;
                  solve(board, row, col + 1);
              } else {
                   board[row][col]=0;
              }
          }
      }
      return ;
    }
//    is safe part''''''''
    static boolean issafe(int[][] board,int row,int col,int num){
        for (int i = 0; i <board.length ; i++) {
            if(board[row][i]==num){
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]==num){
                return false;
            }
        }
        int start=row-(row%3);
        int end=col-(col%3);
        for(int i=start;i<start+3;i++){
            for (int j = end; j < end+3 ; j++) {
                if(board[i][j]==num){
                    return false;
                }

            }
        }
       return true;
    }
}
