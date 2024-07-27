package Arrays;

import java.util.Arrays;

public class manimumMovestoEqualArrayElementII {
    public static void main(String[] args) {
        int nums[]={1,10,2,9};
        System.out.println(minMoves2(nums));
        
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        int value=nums[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=value-nums[i];


        }
        for(int i=n+1;i<nums.length;i++){
            sum+=nums[i]-value;


        }
        return sum;
        
    }

    
}