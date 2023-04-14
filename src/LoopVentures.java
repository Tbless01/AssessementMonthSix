public class LoopVentures {
    public static void main(String[] args) {
        String ventures = "ventures";
        for (int i = 0; i < ventures.length(); i+=2) {
            System.out.println(ventures.charAt(i) +""+ventures.charAt(1+i));
        }
    }
}
