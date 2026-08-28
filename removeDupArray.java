public class removeDupArray {

    public int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[ptr]) {
                ptr += 1;
                nums[ptr] = nums[i];
            }
        }

        return ptr + 1;
    }
}