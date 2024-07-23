package Arrays;

import java.util.ArrayList;

public class reversePairs {
    public static void main(String[]args){
        int nums[]={1,3,2,3,1};
        System.out.println(reversepairs(nums));
    }

    public  static int reversepairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
        
    }

    public static int mergeSort(int []a,int low,int high){
    int ctr=0;
    if(low>=high) return ctr;
    int mid=(low+high)/2;
    ctr+=mergeSort(a,low,mid);
    ctr+=mergeSort(a,mid+1,high);
    ctr+=merge(a,low,mid,high);
    return ctr;
    }
    
    public  static int merge(int []a,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int l=low;
        int r=mid+1;
        int j=mid+1;
        int ctr=0;
         for (int i = low; i <= mid; i++) {
            while (j <= high && a[i] > 2L * a[j]) {
                j++;
            }
            ctr += (j - (mid + 1));
        }
        while(l<=mid && r<=high){
            if(a[l]<=a[r]){
                temp.add(a[l]);
                l++;
                
            }
            else{
                temp.add(a[r]);
                r++;
            }
        }
        while(l<=mid){
            temp.add(a[l]);
            l++;
        }
        while(r<=high){
            temp.add(a[r]);
            r++;
        }
        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
        return ctr;
    }           
                
    
}
