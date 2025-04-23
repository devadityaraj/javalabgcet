import java.util.Scanner;

public class ExpectionHandlingExample {

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
            System.out.println("Error: Cant divide by zero");
        } catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }
    }
}
