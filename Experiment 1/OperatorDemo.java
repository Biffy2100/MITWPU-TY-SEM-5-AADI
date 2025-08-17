public class OperatorDemo {
    public static void main(String[] args) {
        // Logical operators (boolean)
        boolean a = true, b = false;
        System.out.println("Logical AND (a && b): " + (a && b));
        System.out.println("Logical OR (a || b): " + (a || b));
        System.out.println("Logical NOT (!a): " + (!a));

        // Bitwise operators (integers)
        int x = 5;  // 0101 in binary
        int y = 3;  // 0011 in binary

        System.out.println("Bitwise AND (x & y): " + (x & y)); // 1
        System.out.println("Bitwise OR (x | y): " + (x | y));  // 7
        System.out.println("Bitwise XOR (x ^ y): " + (x ^ y)); // 6
        System.out.println("Bitwise NOT (~x): " + (~x));       // -6 (two's complement)
        System.out.println("Bitwise Left Shift (x << 1): " + (x << 1));   // 10
        System.out.println("Bitwise Right Shift (x >> 1): " + (x >> 1));  // 2
        System.out.println("Unsigned Right Shift (x >>> 1): " + (x >>> 1)); // 2
    }
}
