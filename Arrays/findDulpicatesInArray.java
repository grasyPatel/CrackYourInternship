package Arrays;

import java.util.ArrayList;
import java.util.List;

public class findDulpicatesInArray{
     public static void main(String[]args){
        int []nums={4,3,2,7,8,2,3,1};
        
        List<Integer> l=new ArrayList<Integer>();
        System.out.println(findDuplicates(nums, l));
     }


     public  static List<Integer> findDuplicates(int[] nums, List<Integer> l) {
        int n=0;
        while(n<nums.length){
            int index=nums[n]-1;
            if(nums[n]!=nums[index]){
                int temp=nums[n];
                nums[n]=nums[index];
                nums[index]=temp;
            }
            else{
                n++;
            }    
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                l.add(nums[i]);
            }
        }
        return l;
       
    }
}

       