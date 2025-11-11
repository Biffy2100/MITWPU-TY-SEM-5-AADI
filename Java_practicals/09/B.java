import java.util.Scanner;

// Custom exception for even numbers
class Odd extends RuntimeException {
    public Odd(String str) {
        super(str);
    }
}

public class Main {
    // Method that declares it might throw an Even exception
    public static void check(int num) throws Odd {
        if (num % 2 != 0) {
            throw new Odd("Number is not even!"); // Throw the custom exception
        } else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        try {
            check(a); // Call the method that might throw Even
        } catch (Odd e) { // Catch the custom Even exception
            System.out.println("Exception detected: " + e.getMessage());
        } finally {
            System.out.println("Code executed");
            sc.close();
        }
    }
}