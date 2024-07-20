package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumI {
    public static void main(String []args){
        int []nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(mp.containsKey(c)){
                return new int[]{mp.get(c),i};

            }
            mp.put(nums[i],i);
        }
        return new int[0];
        
    }
    
}
