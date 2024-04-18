import java.util.*;

//code to calculate consecutive + Flipping zero'ss
public class consecutive {
    public static void main(String[] args) {
        int array[] = { 1, 1, 1, 0, 1, 1, 0, 0, 1, 0 };

        int n = array.length, sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                sum = sum + 1;
            } else if (i < n - 1 && array[i] == 0 && array[i + 1] != 0) {
                sum = sum + 1;
            } else {
                System.out.println(sum);
                sum = 0;
            }
        }
    }

}
