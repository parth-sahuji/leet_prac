class Solution {
    public int climbStairs(int n) {
        int pre1 = 1;
        int pre2 = 2, current = 0;

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        for (int i = 3; i <= n; i++) {
            current = pre1 + pre2;

            pre1 = pre2;
            pre2 = current;
        }

        return current;
    }
}