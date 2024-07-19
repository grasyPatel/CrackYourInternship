package Arrays;
import java.util.*;

/**
 * findTheDuplicateNumber
 */
public class findTheDuplicateNumber {

    public static void main(String args[]){
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));



    }
    public static int removeDuplicates(int[] nums) {
        int m =0;
        int []arr1=new int[nums.length];
        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                arr1[m++]=nums[i];
                
            }
        }
        arr1[m++]=nums[nums.length-1];
        for(int i =0;i<m;i++){
            nums[i]=arr1[i];
        }
        //printing Array
        System.out.println(Arrays.toString(arr1));
        return m;
        
    }
}
