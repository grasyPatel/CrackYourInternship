package Arrays;

public class jumpGame {
    public static void main(String[] args) {
        int []nums={2,3,1,1,4};
        System.out.println(canJump(nums));
        
    }
    public static boolean canJump(int[] nums) {
        int target=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(target<=i+nums[i]) target=i;
        }
        return target==0;
        
        
    }
    
}
