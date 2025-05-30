class Solution {
    public int climb(int n, int[] dp) {
        if (n == 0 || n == 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(n, dp);
    }
}