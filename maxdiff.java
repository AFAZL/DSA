import java.util.*;

//Max difference between two consecutive element in an array
public class maxdiff {
    public static void main(String[] args) {
        int array[] = { 5, 4, 2, 9, 6, 15 };
        int n = array.length, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && array[i] < array[i + 1]) {
                sum = Math.max(sum, array[i + 1] - array[i]);
            }
        }
        System.out.println(sum);
    }
}
