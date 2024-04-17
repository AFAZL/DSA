import java.util.*;

public class AR1 {
    public static void merge(int[] a, int m, int[] b, int n) {
        ArrayList<Integer> aux = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                aux.add(a[i]);
                i++;
            } else {
                aux.add(b[j]);
                j++;
            }
        }
        while (i < m) {
            aux.add(a[i]);
            i++;
        }
        // Add remaining elements of b
        while (j < n) {
            aux.add(b[j]);
            j++;
        }
        for (int z = 0; z < m + n; z++) {
            a[z] = aux.get(z);
        }

    }

    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 0, 0, 0 };
        int[] b = { 4, 5, 6 };
        int m = 3;
        int n = b.length;
        merge(a, m, b, n);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }

}