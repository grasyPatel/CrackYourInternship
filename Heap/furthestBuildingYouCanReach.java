package Heap;

import java.util.PriorityQueue;

public class furthestBuildingYouCanReach {
    public static void main(String[] args) {
        int []heights={4,2,7,6,9,14,12};
        int bricks=5;
        int ladders=1;
        System.out.println(furthestBuilding(heights, bricks, ladders));

    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max heap
        int n = heights.length;
        int i;
        for (i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (bricks >= diff) {
                    bricks -= diff;
                    pq.offer(diff);
                } else if (ladders > 0) {
                    if (!pq.isEmpty() && pq.peek() > diff) {
                        int top = pq.poll();
                        bricks += top - diff;
                        pq.offer(diff);
                        ladders--;
                    } else {
                        ladders--;
                    }
                } else {
                    break;
                }
            }
        }
        return i;
    }
}
