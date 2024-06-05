import java.util.Arrays;

class Solution {
    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2; // To prevent potential overflow
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { -7, 0, 1, 2, 4, 5, 7, 9, 11 };
        int tar = 4;

        // Perform the search
        int result = search(array, tar);
        System.out.println(result);

    }
}
