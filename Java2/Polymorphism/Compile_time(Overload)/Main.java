class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(10, 20));     // Calls add(int, int)
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30)); // Calls add(int, int, int)
    }
}
