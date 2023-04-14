public class Mississippi {
    public static void main(String[] args) {
        String mississippi = "miiississippi";
int s = 0;
int i = 0;
        for (int count = 0; count < mississippi.length(); count++) {
           if (mississippi.charAt(count) == 's')s++;
           if (mississippi.charAt(count) == 'i')i++;
        }
        System.out.println("s occurs: "+s+" times" +"\nand i occurs: "+i+" times");
    }

}
