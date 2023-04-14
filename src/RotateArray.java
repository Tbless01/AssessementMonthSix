import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] number ={1,2,3,4,5};
        System.out.println(Arrays.toString(sorting(number)));
    }
    public static int[] sorting(int[] number) {
        int[] arr = new int[number.length];
        int store = 0;
        for (int i = 0; i < number.length-1; i++) {
            arr[0] = number[number.length-1];
            arr[i + 1] = number[i];
        }
        return arr;

    }
}
