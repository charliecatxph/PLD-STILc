
public class Main {

    public static void main(String[] args) {
// Arithmetic operations
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
// Assignment operations
        int x = 10;
        System.out.println("\nAssignment Operations:");
        x += 5;
        System.out.println("x += 5: " + x);
        x *= 2;
        System.out.println("x *= 2: " + x);
// Unary operations
        int c = 5;
        System.out.println("\nUnary Operations:");
        System.out.println("c++: " + c++);
        System.out.println("++c: " + ++c);
// Comparison operations
        System.out.println("\nComparison Operations:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
// Shift operations
        int d = 8;
        System.out.println("\nShift Operations:");
        System.out.println("d << 1: " + (d << 1));
        System.out.println("d >> 1: " + (d >> 1));
    }
}
