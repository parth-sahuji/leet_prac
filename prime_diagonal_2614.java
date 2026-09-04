public class prime_diagonal_2614 {

    public static int diagonalPrime(int[][] nums) {

        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {

            int first = nums[i][i];

            if (isPrime(first)) {
                maxPrime = Math.max(maxPrime, first);
            }

            int second = nums[i][n - i - 1];

            if (isPrime(second)) {
                maxPrime = Math.max(maxPrime, second);
            }
        }

        return maxPrime;
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = diagonalPrime(nums);

        System.out.println("Largest prime in diagonal: " + result);
    }
}