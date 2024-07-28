package Arrays;

import java.util.Stack;

public class largetRectangleinHistogram {
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
        
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int[] l = new int[heights.length];
        int[] r = new int[heights.length];
        int[] ans = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                l[i] = -1;
            } else {
                l[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                r[i] = heights.length;
            } else {
                r[i] = s.peek();
            }
            s.push(i);
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = r[i] - l[i] - 1;
            max = Math.max(width * heights[i], max);
        }
        return max;
    }
}
