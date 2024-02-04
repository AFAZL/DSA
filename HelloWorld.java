import java.util.Scanner;
import java.util.Arrays;

class HelloWorld {
    public static int insert_end(int[] array, int x, int val) {
        if (x < 100) {
            array[x] = val;
            return x + 1;

        }
        return x;
    }

    public static int insert_beg(int[] array, int x, int val) {
        for (int i = x; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = val;
        return x + 1;
    }

    public static int del_beg(int array[], int x) {
        for (int i = 0; i < x; i++) {
            array[i] = array[i + 1];
        }
        return x - 1;
    }

    public static int del_end(int[] array, int x) {
        if (x >= 1) {
            array[x - 1] = 0;
            return x - 1;

        }
        return x;
    }

    public static int del_ind(int array[], int x, int index) {
        for (int i = index; i < x; i++) {
            array[i] = array[i + 1];
        }
        return x - 1;
    }

    public static int insert_ind(int array[], int x, int val, int index) {

        for (int i = x; i >= index + 1; i--) {
            array[i] = array[i - 1];
        }
        array[index] = val;
        return x + 1;
    }

    public static void display(int array[], int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of error: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int array[] = new int[100];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the element you want in an array: ");
            int val = sc.nextInt();
            array[i] = val;
        }

        display(array, x);
        x = insert_ind(array, x, 999, 2);
        System.out.println("After inserting the elemenet in an aaray: ");
        display(array, x);
    }
}