import java.util.Arrays;

class Solution {

    public int numberOfCoins(int i, int target, int[] coins, int[][] dp) {
        if (i == 0) {
            if (target % coins[0] == 0)
                return target / coins[0];
            else
                return (int) 1e8;
        }

        if (dp[i][target] != -1)
            return dp[i][target];

        int notTake = numberOfCoins(i - 1, target, coins, dp);
        int take = (int) 1e8;

        if (coins[i] <= target) {
            take = 1 + numberOfCoins(i, target - coins[i], coins, dp);
        }

        return dp[i][target] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], -1);
        }

        int ans = numberOfCoins(n - 1, amount, coins, dp);
        return ans >= (int) 1e8 ? -1 : ans;
    }
}
