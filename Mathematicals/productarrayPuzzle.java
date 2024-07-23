
import java.util.*;

public class productarrayPuzzle {
    public static void main(String []args){
        int []nums={10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(nums, 5)));
    }
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] arr=new long[n];
        arr[0]=1;
        long index=1;
        
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
            
        }
        for(int i=n-1;i>=0;i--){
            arr[i]*=index;
            index*=nums[i];
        }
        return arr;
	} 
    
}
