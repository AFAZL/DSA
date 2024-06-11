import java.util.Arrays;

public class longestsub {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array of strings
        Arrays.sort(strs);

        // Compare the first and last string
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Find the common prefix between the first and last string
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        longestsub solution = new longestsub();

        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs1)); // Output: "fl"
    }
}
