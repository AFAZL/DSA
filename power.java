import java.util.*;
//power of any number ............

public class power {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return temp * temp / x;
            }
        }
    }

    public static void main(String[] args) {
        power obj = new power();
        double result = obj.myPow(45.00, 3);
        System.out.println("Result: " + result);
    }
}
