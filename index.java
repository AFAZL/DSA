import java.util.*;

public class index {
    public static void main(String args[]) {
        int[] a = { 2, 1, 3, 5, 4, 7 };
        int n = a.length;

        int[] b = { 2, 4, 5 };
        for (int j = 0; j < b.length; j++) {
            int z = b[j];
            int res = 0; // Reset res for each element in b

            for (int i = 0; i < n; i++) {
                if (i != z) {
                    res = Math.max(res, a[i]);
                }
            }
            System.out.println(res); // Print the maximum after processing each element in b
        }
    }
}
