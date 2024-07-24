package Matrix;
import java.util.Arrays;

public class rotateImage{

    public static void main(String[]args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        
    }

    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int li=0;
            int ri=matrix.length-1;
            while(li<ri){
                int temp=matrix[i][li];
                matrix[i][li]=matrix[i][ri];
                matrix[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
}