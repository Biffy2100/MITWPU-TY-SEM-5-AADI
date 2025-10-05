import java.util.*;

// User-defined exception must extend Exception or RuntimeException
class MyException extends Exception {
    public MyException(String str) {
        super(str); // call parent class constructor
    }
}

public class A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String p = "1234";

        System.out.print("Enter password: ");
        String c = s.next();

        try {
            if (!p.equals(c)) {
                throw new MyException("Authentication Failure! Wrong Password.");

            }
            System.out.println("Login Successful!");
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}