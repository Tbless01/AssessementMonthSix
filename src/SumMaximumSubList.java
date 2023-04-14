public class SumMaximumSubList {
    public static void main(String[] args) {
        int[] number = {-4, -2, -5, 1, 2, 3, 6, -5, 1};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 1) {
                sum += number[i];
            }
        }
        System.out.println(sum);
    }
}
