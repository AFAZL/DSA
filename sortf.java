class HelloWorld {
    static int findM(int nums[]) {
        int max = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index; 
    }
    
    static int[] sortF(int nums[]) {
        int farray[] = new int[10]; 
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            farray[index] = farray[index] + 1;
        }
        
        int ans[] = new int[nums.length], z = 0;
        while (z < nums.length) {
            int x = findM(farray);
            int value = farray[x];
            farray[x] = 0; 
            for (int j = 0; j < value; j++) {
                ans[z] = x;
                z++;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 4, 4, 4, 5, 5, 9, 9,7,7,7,7,7,8,8,8,8,0};
        int res[] = sortF(array);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

