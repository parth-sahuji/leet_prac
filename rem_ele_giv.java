public class rem_ele_giv {

    public static int removeElement(int[] nums, int val) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }

        return ptr;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Number of elements: " + k);

        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}