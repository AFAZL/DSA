import java.util.*;

//Addition of elements in an array from range efficiently
public class maxdiff {
    public static void main(String[] args) {
        int array[] = { 0, 0, 0, 0, 0, 0, 0 };
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Query you want : ");
        int q = sc.nextInt();

        for (int j = 0; j < q; j++) {
            System.out.println("Enter l: ");
            int l = sc.nextInt();
            System.out.println("Enter r: ");
            int r = sc.nextInt();

            array[l] = array[l] + 1;
            if (l + r < n) {
                array[r + 1] = array[r + 1] - 1;
            }

        }

        for (int i = 1; i < n; i++) {
            array[i] = array[i] + array[i - 1];
        }
        System.out.println(Arrays.toString(array));

    }
}
