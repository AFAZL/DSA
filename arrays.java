import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 3, B = 3, C = 4;
        int array[][] = new int[A][B];
        int array2[][] = new int[B][C];
        int res[][] = new int[A][C];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.println("Eneter an metrix1 element: ");
                array[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println("Eneter an metrix2 element: ");
                array2[i][j] = sc.nextInt();

            }
        }
        System.out.println("The Element of an array of m1  are: ");

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Element of an array of m1  are: ");
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < C; j++) {
                int ress = 0;
                for (int b = 0; b < B; b++) {
                    ress = ress + array[i][b] * array2[b][j];
                    res[i][j] = ress;
                }
            }
        }
        System.out.println("The Element of an array of res is  are: ");
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
