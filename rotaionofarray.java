import java.util.*;

//Rotaton of an array by value z
public class rotaionofarray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = array.length;
        int ar[] = new int[n];
        int z = 20;
        z = z % n;
        System.out.println(z);
        for (int i = 0; i < n; i++) {
            if (i < z) {
                ar[i] = array[n - z + i];
            } else {
                ar[i] = array[i - z];
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}
