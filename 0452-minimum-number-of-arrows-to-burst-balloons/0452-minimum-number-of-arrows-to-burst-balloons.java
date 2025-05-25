

class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;

        if (n == 0) return 0;

        // Sort 
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int arrow = n;
        int last = points[0][1];

        for (int i = 1; i < n; ++i) {
            if (points[i][0] <= last) {
                arrow--;
                last = Math.min(last, points[i][1]);  // Update the end of overlapping range
            } else {
                last = points[i][1];  // No overlap, update last
            }
        }

        return arrow;
    }
}
