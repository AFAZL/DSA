import java.util.Arrays;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (i < nums.length - 1 && nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            }
            if (target > nums[nums.length - 1]) {
                return nums.length;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = { -7, 0, 1, 2, 4, 5, 7, 9, 11 };
        int tar = -17;

        // Perform the search
        int result = searchInsert(array, tar);
        System.out.println(result);

    }
}
