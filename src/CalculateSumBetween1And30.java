public class CalculateSumBetween1And30 {
    public static void main(String[] args) {
        int number = 30;
        int sum = 0;
        int k =1;
        for (int i = 2; i <= number; i++) {
            if (i % 3 == 0) {
               sum+= i;
                k++;
            }
        }
        System.out.println(sum);
        }
    }

