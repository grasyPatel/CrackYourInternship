package Greedy;

import java.util.Arrays;

public class nonOverlappingInterval {
    public static void main(String[] args) {
        int intervals[][]={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
        
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
          int res=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
     int prev_end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (prev_end > intervals[i][0]) {
                res++;
            } else {
                prev_end = intervals[i][1];
            }
        }

        return res;       
        
    }

     

    
}
