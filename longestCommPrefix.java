public class longestCommPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(findPrefix(strs)); // Output: "fl"
    }

    public static String findPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        String result = "";

        for(int position = 0; position < strs[0].length(); position++) {
            
            for(int i=0;i<strs.length;i++) {
                if(position >= strs[i].length()) {
                    return result;
                }

                char current = strs[i].charAt(position);
                char first = strs[0].charAt(position);
                if(current != first) {
                    return result;
                }
            }
            result += strs[0].charAt(position);
        }
        return result;
    }
}
