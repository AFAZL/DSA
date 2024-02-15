import java.util.*;

public class code {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Hello!!!");
        // String ss = "ADDDD";
        // String str = sc.nextLine();
        // System.out.println(str);
        // String res = str + " " + ss;
        // System.out.println(res);
        // System.out.println(str.charAt(2));
        // System.out.println(str.length());
        // System.out.println(str.substring(2, 7));
        // System.out.println(str.contains("affu"));
        // String ex = " Afzal and Tommy!";
        // System.out.println(ex.trim());
        // String array[] = ex.split(" , ");
        // System.out.println(Arrays.toString(array));
        // StringBuilder str = new StringBuilder("Helo");

        // str.setCharAt(2, 'A');
        // str.append("Afzal");
        // System.out.println(str);
        // String str1 = "ABABABA";
        // int x = 0;
        // String ans = "Yes";
        // int n = str1.length() - 1;
        // for (int i = 0; i <= n; i++, n--) {
        // if (str1.charAt(i) != str1.charAt(n)) {
        // ans = "NO";
        // }
        // }
        // System.out.println(ans);
        String str = "12349";
        int i = 0, j = str.length() - 1;
        int sum = 0, a = str.charAt(i) - '0';
        int b = str.charAt(j) - '0';
        sum = a + b;
        System.out.println(sum);

    }

}
