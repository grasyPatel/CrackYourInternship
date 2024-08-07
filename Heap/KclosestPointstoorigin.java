package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KclosestPointstoorigin {
    
    public static void main(String[] args) {
        int [][]points={{1,3},{-2,2}};
        int k=1;
        int [][]ans=kClosest(points,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(Arrays.toString(ans[i])+",");
        }        
    }
    public static int[][] kClosest(int[][] points, int k) {
         PriorityQueue<Point> q = new PriorityQueue<>();

        for (int[] i: points) {
            Point newP = new Point(i[0], i[1]);
            if(q.size() < k) q.offer(newP);
            else {
                Point lowP = q.peek();
                if (distance(lowP) > distance(newP)) {
                    q.poll();
                    q.offer(newP);
                }
            }
        }
        int[][] ans = new int[q.size()][2];
        int i = 0;
        while(!q.isEmpty()) {
            Point p = q.poll();
            ans[i] = new int[]{p.x, p.y};
            i++;
        }
        return ans;
        
    }
    public static class Point implements Comparable<Point> {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point other) {
            return Integer.compare(distance(other), distance(this));
        }
        public String toString() {
            return "X: " + this.x + " Y: "+ this.y;
        }
    }
    private static int distance(Point p) {
        return p.x*p.x + p.y*p.y;
    }
}
