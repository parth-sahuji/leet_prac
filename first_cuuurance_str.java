public class first_cuuurance_str {

    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            boolean match = true;

            for (int j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Index: " + result);
    }
}