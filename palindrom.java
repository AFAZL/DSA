import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int z = 2; z <= i; z++) {
                System.out.print(z);
            }
            System.out.println(" ");

        }
    }

}
