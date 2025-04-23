package calc;

public class calculator {

    public double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cann't Divide by 0");
                }
                return num1 / num2;

            default:
                System.out.println("Invalid OPERATOR" + operator);
        }
        return 0;
    }
}
