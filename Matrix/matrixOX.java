package Matrix;

import java.sql.Array;
import java.util.*;

public class matrixOX{
    public static void main(String[] args) {
        char [][]matrix={{'X', 'O', 'X', 
        'O', 'X', 'X'},
       {'X', 'O', 'X', 
        'X', 'O', 'X'},
       {'X', 'X', 'X', 
        'O', 'X', 'X'},
       {'O', 'X', 'X',
        'X', 'X', 'X'},
       {'X', 'X', 'X',
        'O', 'X', 'O'},
       {'O', 'O', 'X',
        'O', 'O', 'O'}};
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("Intial Matrix");
        
        for(int i=0;i<m;i++){
            
            System.out.println(Arrays.toString(matrix[i]));
        
        }

        replaceSurround(matrix, n, m);
        System.out.println();
        System.out.println("final Matrix");
        
        for(int i=0;i<m;i++){
            
            System.out.println(Arrays.toString(matrix[i]));
        
        }

    }
    public static void floodFillUtil(char[][] mat,int x,int y,char c,char pre){
    
            if (x < 0 || x >= mat.length ||
            y < 0 || y >= mat.length)
            return;
             
        if (mat[x][y] != c)
            return;
     
    
        mat[x][y] = pre;
     
        
        floodFillUtil(mat, x + 1, y, 
                      c, pre);
        floodFillUtil(mat, x - 1, y, 
                      c, pre);
        floodFillUtil(mat, x, y + 1, 
                      c, pre);
        floodFillUtil(mat, x, y - 1, 
                      c, pre);
    }
    
    public static void replaceSurround(char [][]mat,int n,int m){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]=='O'){
                    mat[i][j]='-';
                }
            }
            
        }
        for (int i = 0; i < m; i++) 
            if (mat[i][0] == '-') floodFillUtil(mat, i, 0, '-', 'O');
        for (int i = 0; i < m; i++) 
            if (mat[i][n - 1] == '-') floodFillUtil(mat, i, n - 1,'-', 'O');
        for (int i = 0; i < n; i++)
            if (mat[0][i] == '-') floodFillUtil(mat, 0, i, '-', 'O');
        for (int i = 0; i < n; i++) 
            if (mat[m - 1][i] == '-') floodFillUtil(mat, m - 1, i, '-', 'O');
         
            
        for(int i=0;i<m;i++)  {
            for(int j=0;j<n;j++){
                if(mat[i][j]=='-') mat[i][j]='X';
            }
        }  
    }

}