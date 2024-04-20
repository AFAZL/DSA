import java.util.*;

//Finding the Sum of Element till i,j inTwo D array.........
public class twoD_Array {
    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 } };
        int ans_Array[][] = new int[200][200];
        int n = 4, m = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    ans_Array[i][j] = array[i][j];
                } else if (i == 0) {
                    ans_Array[i][j] = ans_Array[i][j - 1] + array[i][j];
                } else if (j == 0) {
                    ans_Array[i][j] = ans_Array[i - 1][j] + array[i][j];
                } else {
                    ans_Array[i][j] = ans_Array[i - 1][j] + ans_Array[i][j - 1] - ans_Array[i - 1][j - 1] + array[i][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ans_Array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
