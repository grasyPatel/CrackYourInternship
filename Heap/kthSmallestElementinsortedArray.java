package Heap;

import java.util.PriorityQueue;

public class kthSmallestElementinsortedArray {

    public static void main(String[] args) {
        int [][]matrix={{1,5,9},{10,11,13},{13,12,14}};
        int k=8;
        System.out.println(kthSmallest(matrix, k));

    }
      public static int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (matrix[a[0]][a[1]] - matrix[b[0]][b[1]]));

        for (int i = 0; i < Math.min(n, k); i++) {
            queue.offer(new int[] { i, 0 });
        }
        while (k > 1) {
            int[] cur = queue.poll();
            if (cur[1] < n - 1) {
                cur[1]++;
                queue.offer(cur);
            }
            k--;
        }

        return matrix[queue.peek()[0]][queue.peek()[1]];
        
    }
}