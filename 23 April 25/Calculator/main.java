
import calc.calculator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        calculator cal = new calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the numerator: ");
        char operator = scanner.next().charAt(0);

        double result = cal.calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
}
