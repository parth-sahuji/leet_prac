public class roman_to_integer {


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
    public static int romanToInt(String s) {

        int value = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char digit = s.charAt(i);
            int n = 0;
            if (digit == 'I') {
                n = 1;
            }

            if (digit == 'V') {
                n = 5;
            }

            if (digit == 'X') {
                n = 10;
            }

            if (digit == 'L') {
                n = 50;
            }

            if (digit == 'C') {
                n = 100;
            }
            if (digit == 'D') {
                n = 500;
            }

            if (digit == 'M') {
                n = 1000;
            }

            if (prev > n) {
                value = value - n;
            } else {
                value += n;
            }

            prev = n;

        }
        return value;
    }
}