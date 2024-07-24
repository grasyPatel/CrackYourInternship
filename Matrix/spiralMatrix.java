package Matrix;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String []args){
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
         int startRow=0;
        int endRow=matrix.length-1;
        int startColumn=0;
        int endColumn=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(startRow<=endRow&&startColumn<=endColumn){
            
            for(int i=startColumn;i<=endColumn;i++){
                list.add(matrix[startRow][i]);
            }++startRow;
            
            for(int i=startRow;i<=endRow;i++){
                list.add(matrix[i][endColumn]);
            }--endColumn;
        
            if(startRow<=endRow){
                for(int i=endColumn;i>=startColumn;i--){
                list.add(matrix[endRow][i]);
                }--endRow;
            }
            
            if(startColumn<=endColumn){
                for(int i=endRow;i>=startRow;i--){
                list.add(matrix[i][startColumn]);
                }++startColumn;
            }   
        }
        return list;
        
    }
    
}
