// Try / Catch, 11-30-21

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something broke.");
        } finally {
            System.out.println("Did this work?");
        }
    }
}
