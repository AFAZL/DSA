import java.util.*;

public class single {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num; // XOR all the numbers
        }
        return single;
    }

    public static void main(String[] args) {
        single obj = new single();
        int araay[] = { 4, 5, 6, 4, 5, 6, 1 };
        System.out.println(obj.singleNumber(araay));
    }
}
