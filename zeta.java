import java.util.*;

public class zeta {
    public static boolean isSafe(int l1, int r1, int l2, int r2) {
        if (l2 < l1) {
            int tem = l1;
            l1 = l2;
            l2 = tem;
        }
        if (r2 > r1) {
            int tem = r1;
            r1 = r2;
            r2 = tem;
        }
        for (int i = l1; i <= r1; i++) {
            if (i == l2 || i == r2) {
                return false;
            }
        }
        return true;
    }

    public static int minCost(int arr[][]) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                int l1 = arr[i][0];
                int r1 = arr[i][1];
                int c1 = arr[i][2];
                int l2 = arr[0][0];
                int r2 = arr[0][1];
                int c2 = arr[0][2];
                if (isSafe(l1, r1, l2, r2)) {
                    minCost = Math.min(minCost, (c1 * c2));
                }
            } else {
                int l1 = arr[i][0];
                int r1 = arr[i][1];
                int c1 = arr[i][2];
                int l2 = arr[i + 1][0];
                int r2 = arr[i + 1][1];
                int c2 = arr[i + 1][2];
                if (isSafe(l1, r1, l2, r2)) {
                    minCost = Math.min(minCost, (c1 * c2));
                }
            }
        }
        if (minCost == Integer.MAX_VALUE) {
            return -1;
        }
        return minCost;
    }

    public static int lengthOfLongestSubstring(String s) {
        // your code
        String str = "";
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (str.indexOf(x) == -1) {
                str = str + x;
            } else {
                res = Math.max(res, str.length());
                str = "";
                str = str + x;
            }
        }
        res = Math.max(res, str.length());
        return res;
    }

    public static void main(String[] args) {
        System.out.println("___________________");

        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println("Try programiz.pro");
        // int arr[] = { 5, 1, 2, 9, 7 };
        // int newarr[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // int l = Integer.MAX_VALUE;
        // int r = Integer.MAX_VALUE;
        // // left jaao just bada check karo
        // if (i > 0) {

        // for (int j = i - 1; j >= 0; j--) {
        // if (arr[j] > arr[i]) {
        // int tem = arr[j];
        // l = Math.min(l, tem);
        // }
        // }
        // }
        // // rigth jaao ab , same karo
        // if (i < arr.length - 2) {

        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // int tem = arr[j];
        // r = Math.min(r, tem);
        // }
        // }
        // }
        // // newarr may values daalo
        // if (l == Integer.MAX_VALUE && r == Integer.MAX_VALUE) {
        // newarr[i] = -1;
        // } else if (l == Integer.MAX_VALUE) {
        // newarr[i] = r;
        // } else if (r == Integer.MAX_VALUE) {
        // newarr[i] = l;
        // } else {
        // if (l > r) {
        // newarr[i] = r;
        // } else {
        // newarr[i] = l;
        // }
        // }

        // }

        // print the new arr ->
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(newarr[i] + " ");
        // }
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[][] = new int[x][3];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = minCost(arr);
        System.out.println("The min cost withot overlapping is:-> " + ans);

    }
}
