import java.util.Arrays;

public class SortTwoLists {
    public static void main(String[] args) {
        int[] list1 = {1, 3, 4, 5};
        int[] list2 = {2, 6, 7, 8};
        System.out.println(Arrays.toString(merge(list1,list2)));
    }
     public static int[] merge(int[] list1, int[] list2){
        int a1 = list1.length;
        int b1 = list2.length;
        int c1 = a1 + b1;
        int[] newArray = new int[c1];
        for (int i = 0; i < a1; i = i + 1) {
            newArray[i] = list1[i];
        }
        for (int i = 0; i < b1; i = i + 1) {
            newArray[a1 + i] = list2[i];
        }
        int store = 0;
        for (int j = 0; j < newArray.length - 1; j++) {
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    store = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = store;
                }
            }
        }
        return newArray;
    }
}
