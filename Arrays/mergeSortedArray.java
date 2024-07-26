package Arrays;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int nums1[]={1,2,4,0,0,0};
        int nums2[]={2,5,6};
        merge(nums1,3,nums2,3);
        
    }
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }    
        
    
}
