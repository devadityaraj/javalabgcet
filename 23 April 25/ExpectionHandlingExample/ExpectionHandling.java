
import java.util.Scanner;

public class ExpectionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //Input Numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            //Catch block handles the exception
            System.err.println("Error: Cant divide by zero");
        } catch (Exception e) {
            //This catches any other exception
            System.out.println("An unexpected error occured: " + e.getMessage());
        } finally {
            //This block always execute
            System.out.println("Execution Complete");
            scanner.close();
        }
    }
}
