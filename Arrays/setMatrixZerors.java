package Arrays;

import java.util.*;

public class setMatrixZerors {
    public static void main(String[]args){
        int [][]matrix={{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        setZeroes(matrix);
        System.out.println("OUTPUT: ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void setZeroes(int[][] matrix) {
           List<int[]> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    l.add(new int[]{i,j});
                }
            }
        }
        for(int arr[]:l){
            int r=arr[0];
            int c=arr[1];
            for(int i=0,j=r;i<matrix[0].length;i++){
                matrix[j][i]=0;
            }
            for(int i=0,j=c;i<matrix.length;i++){
                matrix[i][j]=0;
            }

        }
        
    }
    
}
