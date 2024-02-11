import java.util.*;

class noob {

    public static void main(String[] args) {
        int array1[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 1, 2, 3, 4, 5 }
        };
        int row = 4, col = 5;
        int top = 0, down = row - 1, left = 0, right = col - 1;

        while (top <= down && left <= right) {
            for (int i = left; i < right; i++) {
                System.out.print(array1[top][i] + " ");
            }

            for (int i = top; i < down; i++) {
                System.out.print(array1[i][right] + " ");
            }

            for (int i = right; i > left; i--) {
                System.out.print(array1[down][i] + " ");
            }

            for (int i = down; i > top; i--) {
                System.out.print(array1[i][top] + " ");
            }

            top++;
            left++;
            right--;
            down--;
        }
    }
}
