import java.util.*;

public class maxsub {
    public static void main(String[] args) {
        int array[] = { 2, 5, 7, -2, 1, -6, 4, 9, -4, 9 };

        int n = array.length, sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0) {
                sum = sum + array[i];
            } else {

                ar[i - 1] = sum;
                ar[i] = array[i];
                sum = 0;
            }
        }
        ar[n - 1] = sum;

        System.out.println(Arrays.toString(ar));

        sum = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] < 0 && ar[i] + ar[i + 1] > 0) {
                sum = sum + ar[i] + ar[i + 1];
                sum = Math.max(sum, ar[i]);
            }

            sum = Math.max(sum, ar[i]);
        }
        System.out.print(sum);
    }

}
