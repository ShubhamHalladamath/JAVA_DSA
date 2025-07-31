package backtracking;
// no of possibilities of keeping n queens on n*n matrix;

public class b5_N_queens {
    public static void main(String[] args) {
       boolean[][] board=new boolean[4][4];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board,int row){
         if(row==board.length){
             display(board);
             System.out.println();
             return 1;
         }
        int  count =0;

        for (int col = 0; col < board[0].length ; col++) {
               if(issafe(board,row,col)){
                   board[row][col]=true;
                   count=count+queens(board,row+1);
                   board[row][col]=false;
               }
        }
       return count;
    }
    static boolean issafe(boolean[][] board,int row,int col){
//        checking queen in straight row
        for(int i=0;i<row;i++) {
            if (board[i][col]) {
                return false;
            }
        }
//            checking in left digonal
            int maxleft=Math.min(row,col);
            for(int i=1;i<=maxleft;i++){
                if(board[row-i][col-i]){
                    return false;
            }
            }
//            checking in right
        int maxright=Math.min(row,board.length-1-col);
            for (int i=1;i<=maxright;i++){
                if(board[row-i][col+i]){
                    return false;
                }
        }
            return true;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean col:row){
                if(col){
                    System.out.print("Q ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }
}
