import java.util.*;

class Couple {
    int a;
    int b;

    Couple(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equals(Couple c) {
        return a == c.a && b == c.b;
    }

    void dis() {
        System.out.println(" " + a + " " + b);
    }

    String str() {
        return "[ " + a + " , " + b + " ]";
    }
}

public class code {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Hello!!!");
        Couple object = new Couple(1, 8);

        object.dis();
        System.out.println(object.str());
        Couple obj = new Couple(1, 10);

        System.out.println(object.equals(obj));
    }

}
