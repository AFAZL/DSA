import java.util.*;

class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int j = nums.length - 1;
        int start = 0;
        int array[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                array[j] = nums[i];
                j--;
            } else {
                array[start] = nums[i];
                start++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;

    }

    public static void main(String[] args) {
        int array[] = { 4, 5, 1, 4, 8, 9, 3, 11 };
        sortArrayByParity(array);
    }
}
