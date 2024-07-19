package Arrays;
import java.util.*;

public class sortTheColors {
    public static void main(String[]args){
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        
        int arr[]={0,0,0};
        for(int num:nums){
            arr[num]++;
        }
        int index=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i];j++){
                nums[index]=i;
                index++;
            }
        }
        // boolean swap;
        // for(int i=0;i<nums.length;i++){
        //     swap=false;
        //     for(int j=1;j<nums.length-i;j++){
        //         if(nums[j]<nums[j-1]){
        //             int temp=nums[j-1];
        //             nums[j-1]=nums[j];
        //             nums[j]=temp;
        //             swap=true;
        //         }
        //     }
        //     if(!swap){
        //         break;
        //     }
        // }
        //improving TC;
        
    }
    
}
