
class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 0) return 0;

        // Sort intervals by start point
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prev = points[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            int currStart = points[i][0];
            int currEnd = points[i][1];
            int prevStart = prev[0];
            int prevEnd = prev[1];

            if (currStart > prevEnd) { // no overlap
                count++;
                prev = points[i];
            } else { // overlap
                prev[0] = Math.max(prevStart, currStart);
                prev[1] = Math.min(prevEnd, currEnd);
            }
        }

        return count;
    }
}
