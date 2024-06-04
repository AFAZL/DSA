import java.util.Arrays;
import java.util.*;

class merge {
    public int[] MS(int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        int ans[] = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;

    }

    public int[] ins(int array[]) {
        int n = array.length;
        if (n == 1) {
            return array;
        }
        int left[] = Arrays.copyOfRange(array, 0, n / 2);
        int right[] = Arrays.copyOfRange(array, n / 2, n);

        left = ins(left);
        right = ins(right);

        return MS(left, right);

    }

    public static void main(String[] args) {
        merge obj = new merge();
        int[] array = { 5, 3, 8, 4, 2 };
        array = obj.ins(array);
        System.out.println(Arrays.toString(array));
    }
}
