package Heap;

import java.util.Arrays;
import java.util.Stack;

public class findtheMostcompetitiveSubsequence {
    public static void main(String[] args) {
        int nums[]={3,5,2,6};
        int k=2;
        System.out.println(Arrays.toString(mostCompetitive(nums, k)));

        
    }

     public  static int[] mostCompetitive(int[] nums, int k) {
         Stack<Integer> st = new Stack<>();

        for(int i=0; i<nums.length; i++){
            
            while(st.size()!=0 && nums[st.peek()]>nums[i] && st.size()+nums.length-i>k) st.pop();
            if(st.size()<k) st.push(i);
        }

        int ans[] = new int[k];

        for(int i=k-1; i>=0; i--){
            ans[i] = nums[st.pop()];
        }

        return ans;
    }
    
}
