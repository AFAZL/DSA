import java.util.*;

public class day1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your first number ");
    // int a = sc.nextInt();
    // System.out.println("Enter your Second number ");
    // int b = sc.nextInt();
    // if (a > b) {
    // System.out.println("the no " + a + " is greater.");
    // } else if (b > a) {
    // System.out.println("the no " + b + " is greater.");
    // } else {
    // System.out.println("Both " + a + " and " + b + " are Equal.");
    // }
    // System.out.println("Enter the number ");
    // int num = sc.nextInt();

    // switch (num) {
    // case 1:
    // System.out.println("Today is Monday!");
    // break;
    // case 2:
    // System.out.println("Today is Tuesday!");
    // break;
    // case 3:
    // System.out.println("Today is Wednesday!");
    // break;
    // case 4:
    // System.out.println("Today is Thursday!");
    // break;
    // case 5:
    // System.out.println("Today is Friday!");
    // break;
    // case 6:
    // System.out.println("Today is Saturday!");
    // break;
    // case 7:
    // System.out.println("Today is Sunday!");
    // break;
    // default:
    // System.out.println("Wrong input");
    // break;
    // }
    // int sum = 0;
    // int i = 0;
    // while (i <= num) {
    // sum = sum + i;
    // i++;
    // }
    // System.out.println("Sum is: " + sum);
    int n = 5, z = n, l = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println(" ");
    }
  }
}