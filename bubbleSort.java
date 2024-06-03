import java.util.Arrays;

class bubbleSort {
    public void ins(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    break;
                }
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        bubbleSort obj = new bubbleSort();
        int array[] = { 9, 5, 1, 4, 2, 8 };

        obj.ins(array);
    }
}
