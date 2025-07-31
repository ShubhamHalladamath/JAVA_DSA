package backtracking;

public class b6_N_nights {
    public static void main(String[] args) {
           int n=3;
           boolean[][] board=new boolean[n][n];
           nights(board,0,0,n);
    }
    static void nights(boolean[][] board,int row,int col,int target){
        if(target==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }

        if(col==board.length) {
            nights(board,row+1,0,target);
            return;
        }
        if(issafe(board,row,col)) {
                board[row][col]=true;
                nights(board,row,col+1,target-1);
                board[row][col]=false;
            }
            nights(board,row,col+1,target);


    }


    static boolean issafe(boolean[][] board,int row,int col){
        if(isvalid(board,row-2,col-1)){
            if(board[row-2][col-1]) {
                return false;
            }
        }
        if(isvalid(board,row-2,col+1)){
            if(board[row-2][col+1]) {
                return false;
            }
        }
        if(isvalid(board,row-1,col-2)){
            if(board[row-1][col-2]) {
                return false;
            }
        }
        if(isvalid(board,row-1,col+2)){
            if(board[row-1][col+2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isvalid(boolean[][] board,int row,int col) {
              if(row>=0 && row<board.length && col<board.length && col>=0) {
                       return true;
              }
       return false;
    }



static void display(boolean[][] board){
    for(boolean[] row:board){
        for(boolean col:row){
            if(col){
                System.out.print("K ");
            }else{
                System.out.print(". ");
            }
        }
        System.out.println();
    }

}
}

