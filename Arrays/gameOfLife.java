package Arrays;
import java.util.Arrays;
public class gameOfLife {

    public static void main(String[] args) {
        int [][]board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        //Printing Initial board
        for(int i=0;i<board.length;i++){
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println("***********************************");
        gameOfLife(board);
    }
    public static void gameOfLife(int[][] board) {
        int []dx={1,1,0,-1,-1,-1,0,1};
        int []dy={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int count=0;
                for(int k=0;k<8;k++){
                    if(helper(i+dx[k],j+dy[k],board.length,board[0].length)&&  Math.abs(board[i+dx[k]][j+dy[k]])==1){
                        count++;
                    }
                }
                if(board[i][j]==0 && count==3){
                    board[i][j]=2;
                }
                if(board[i][j]==1 && (count<2 || count>3)){
                    board[i][j]=-1;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=board[i][j]>0?1:0;
            }
        }
        //Prniting the final  board
        for(int i=0;i<board.length;i++){
            System.out.println(Arrays.toString(board[i]));
        }
        
    }
    public static boolean helper(int x,int y,int r,int c){
        return (x>=0 && x<r && y>=0 && y<c);
    }
}