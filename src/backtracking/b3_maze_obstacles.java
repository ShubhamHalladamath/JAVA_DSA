package backtracking;

public class b3_maze_obstacles {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        maze2("",board,0,0);
    }
    static void maze2(String p,boolean[][] board,int row,int col){
        if(row== board.length-1 && col==board[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!board[row][col]){
            return;
        }
        if(row<board.length-1){
            maze2(p+'d',board,row+1,col);
        }
        if(col<board[0].length-1){
            maze2(p+'r',board,row,col+1);
        }
    }
}
