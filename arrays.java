import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int array[] = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(Arrays.toString(array));
        for (int s = 0; s < 5; s++) {
            for (int e = s; e < 5; e++) {
                for (int z = s; z <= e; z++) {
                    System.out.print(array[z] + " ");
                }
                System.out.println();
            }
        }
    }
}
