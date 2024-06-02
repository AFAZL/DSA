import java.util.*;

public class fibo {

    public int fb(int x) {
        int ans = 0;
        if (x == 0 || x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            ans = fb(x - 1) + fb(x - 2);
        }

        return ans;
    }

    public static void main(String[] args) {
        fibo obj = new fibo();
        int x = 6;
        System.out.println(obj.fb(x));
    }
}
