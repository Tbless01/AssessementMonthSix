import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("how many numbers would you like to enter"));
        int numberOfElement = scanner.nextInt();
        int[] number = new int[numberOfElement];

        System.out.println("Enter numbers");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();

        }
        int store = 0;
        for (int j = 0; j < number.length - 1; j++) {
            for (int i = 0; i < number.length - 1; i++) {
//                number[i] = scanner.nextInt();
                if (number[i] > number[i + 1]) {
                    store = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = store;
//                System.out.println("second largest is: "+number[i]);
                }
            }
        }
        System.out.println(Arrays.toString(number));
            System.out.println("second largest is: " + number[number.length-2]);
    }

}
