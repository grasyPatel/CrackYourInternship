package Arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement{
    public static void main(String[]args){
        int nums[]={1,2,2,2,2,1,1};
        System.out.println(majorityElement1(nums));
        System.out.println(majorityElement2(nums));
       
    }
    //approach1
    public static int majorityElement1(int[] nums) {
        Map<Integer , Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int max=0;
        int ans=0;
        for(Map.Entry<Integer ,Integer> map:mp.entrySet()){
            int n=map.getValue();
            if(max<n){
                ans=map.getKey();
                max=n;

            }
        }
        return ans;
        
    }
    //Approach2 faster-one 
    public static int majorityElement2(int[] nums) { 
        int biggest=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(k==0){
                k++;
                biggest=nums[i];
            }
            else if(biggest==nums[i]){
                k++;
            }
            else{
                k--;
            }
            
           
        }
        return biggest;
        
        
    }

}