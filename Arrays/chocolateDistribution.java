package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class chocolateDistribution {
    public static void main(String[]args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(56);
        a.add(7);
        a.add(9);
        a.add(12);
        System.out.println(findMinDiff(a, 8, 5));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       Collections.sort(a);
       long res=a.get(a.size()-1);
       int i=0;
       int j=m-1;
       while(j<a.size()){
           res=Math.min(res,a.get(j)-a.get(i));
           i++;
           j++;
           
       }
       return res;
    }
    
}
