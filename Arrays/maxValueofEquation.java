package Arrays;

import java.util.PriorityQueue;

public class maxValueofEquation {
    public static void main(String[] args) {
        // Sample data for demonstration
        int[][] points = { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
        int k = 1;

        int result = findMaxValueOfEquation(points, k);
        System.out.println("Max value of equation: " + result);
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getKey().equals(b.getKey()) ? a.getValue() - b.getValue() : b.getKey() - a.getKey()
        );
        int res = Integer.MIN_VALUE;
        for (int[] point : points) {
            while (!pq.isEmpty() && point[0] - pq.peek().getValue() > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                res = Math.max(res, pq.peek().getKey() + point[0] + point[1]);
            }
            pq.offer(new Pair<>(point[1] - point[0], point[0]));
        }
        return res;
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

