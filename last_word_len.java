public class last_word_len {

    public static int lengthOfLastWord(String s) {

        int len = s.length() - 1;
        int count = 0;

        while (len >= 0) {

            if (s.charAt(len) != ' ') {
                count++;
            }

            if (count > 0 && s.charAt(len) == ' ') {
                break;
            }

            len--;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "Hello World";

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}