
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class denver {
    public static String rev(String str, int index) {
        if (index < 0) {
            return "";
        }
        System.out.print(str.charAt(index));
        return rev(str, index - 1);
    }

    public static boolean sort(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        } else {
            if (arr[index] < arr[index + 1]) {
                index = index + 1;
                return sort(arr, index);
            } else {
                return false;
            }
        }
    }

    public static String xlast(String str, int index, String str2, String xall) {
        if (index == str.length())
            return str2 + xall;
        if (str.charAt(index) == 'x') {
            xall = xall + "x";
        } else {
            str2 = str2 + str.charAt(index);
        }
        return xlast(str, index + 1, str2, xall);

    }

    public static boolean map[] = new boolean[26];

    public static String nodup(String str, int index, String res) {
        if (index == str.length())
            return res;
        char x = str.charAt(index);
        if (map[x - 'a']) {
            return nodup(str, index + 1, res);
        } else {
            res = res + x;
            map[x - 'a'] = true;
            return nodup(str, index + 1, res);
        }
    }

    public static void subseq(String str, int index, String res, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(res)) {
                return;
            } else {
                System.out.println(res);
                set.add(res);
                return;
            }
        }
        char x = str.charAt(index);
        subseq(str, index + 1, res + x, set);
        subseq(str, index + 1, res, set);
    }

    public static void main(String[] args) {
        // int array[]={1,3,4,4,6,7,9};
        // System.out.println(sort(array,0));
        // String str="abcxdefgxhijkxl";
        // System.out.print(xlast(str,0,"",""));
        HashSet<String> set = new HashSet<>();
        System.out.println("Try programiz.pro");
        String str = "aaaaa";
        subseq(str, 0, "", set);
        // String name = "afzalaffu";
        // System.out.print(nodup(name,0,""));
        // String name="Tommy";
        // rev(name,name.length()-1);
    }
}