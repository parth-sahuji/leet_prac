class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square > x) {
                right = (int) mid - 1;
            } else {
                ans = (int) mid;
                left = (int) mid + 1;
            }
        }

        return ans;
    }
}