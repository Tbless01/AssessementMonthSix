public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {
//                9, 2, 3, 2, 6, 6
                4, 5, 1, 2, 0, 4
        };
        int k = 0;
        int number = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] != arr[j + 1]) {
                    number = arr[i];
                }
                k++;
            }
        }
        System.out.println(number);
    }
}
