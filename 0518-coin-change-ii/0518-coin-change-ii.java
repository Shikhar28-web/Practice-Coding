class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return Coin_change(coins, amount, 0, dp);
    }

    public int Coin_change(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (i == coins.length) {
            return 0;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int inc = 0, exc = 0;
        if (coins[i] <= amount) {
            inc = Coin_change(coins, amount - coins[i], i, dp);
        }
        exc = Coin_change(coins, amount, i + 1, dp);
        return dp[i][amount] = inc + exc;
    }
}