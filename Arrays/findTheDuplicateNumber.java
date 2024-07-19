package Arrays;
import java.util.*;

/**
 * findTheDuplicateNumber
 */
public class findTheDuplicateNumber {

    public static void main(String args[]){
        int nums[]={3,4,4,4,4};
        System.out.println(findDuplicate(nums));



    }
    public  static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int index=nums[i]-1;
            if(nums[i]!=nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        return -1;

    }
}
