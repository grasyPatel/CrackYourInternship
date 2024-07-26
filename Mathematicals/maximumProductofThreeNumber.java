import java.util.Arrays;

public class maximumProductofThreeNumber {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(maximumProduct(nums));
        int nums2[]={-1,-2,-3};
        System.out.println(maximumProduct(nums2));
        
    }
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int m1 = nums[n-1]*nums[n-2]*nums[n-3];
        int m2 = nums[0]*nums[1]*nums[n-1];
        if(m1>m2){
            return m1;
        }
        else{
            return m2;
        }
    }
    
}
