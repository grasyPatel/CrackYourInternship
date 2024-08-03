package SortingAndSearching;

public class searchinRotatedSortedArray {

    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target =0;
        System.out.println(search(nums, target));
    }


    public static int search(int[] nums, int target) {
        int count =0;
       while(count<nums.length){
           if(target==nums[count]){
               return count;
           }
           count++;
       }
       return -1; 
    }
    
}
