class Calculate {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    public void sub(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
    @Override
    public String toString() {
        return "Calculate []";
    }
}

public class calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        Calculate c = new Calculate();
        
        c.add(a, b);
        c.sub(a, b);
        c.multiply(a, b);
    }
}
