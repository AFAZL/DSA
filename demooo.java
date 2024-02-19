import java.util.*;

public class demooo {
    public static void main(String[] args) {
        int num = 1634;
        int num1 = num;
        int sum = 0;

        int z = String.valueOf(num1).length();

        for (int i = 0; i < z; i++) {
            int val = num1 % 10;
            val = (int) Math.pow(val, z);
            System.out.println(val);
            sum = sum + val;
            num1 = num1 / 10;
        }
        System.out.println(sum + " " + num);
        if (sum == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
