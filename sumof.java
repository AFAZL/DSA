import java.util.*;

//Sum of two Element Should be Equal to X..........................
public class rotaionofarray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 3, 6, 7, 1 };
        int n = array.length, x = 10;
        int ar[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < n; i++) {
            int tem = array[i];

            if (ar[x - tem] == 1) {
                System.out.println("True");

            } else {
                System.out.println("False");
            }
            ar[tem] = 1;

        }
        System.out.println(Arrays.toString(ar));

    }
}
