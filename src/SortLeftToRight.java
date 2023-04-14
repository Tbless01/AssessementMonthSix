import java.util.Arrays;

public class SortLeftToRight {
    public static void main(String[] args) {

        int[] number = {10, -1, 20, 4, 5, -9, -6};
        System.out.println(Arrays.toString(sorting(number)));
    }

    public static int[] sorting(int[] number) {
        int store = 0;
        for (int j = 0; j < number.length - 1; j++) {
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    store = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = store;
                }
            }
        }
        return number;
    }
}