import java.util.*;

public class AR {
    public static void main(String args[]) {
        int[] array = { 1, 8, 5, 12, 4, 9, 7, 6 };
        int[] ar = new int[10];
        int n = 3, p = 0, sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            System.out.println(sum);
            ar[i] = sum;

            sum = 0;
        }
        int max = 0;
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.print(max);

    }

}