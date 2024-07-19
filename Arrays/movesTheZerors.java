package Arrays;
import java.util.*;

public class movesTheZerors {
    public static void main(String[]args){
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            
                j++;
            }
           i++;
        }   
        
    }
    
}
