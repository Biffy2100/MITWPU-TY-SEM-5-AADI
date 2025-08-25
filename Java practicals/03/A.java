import java.util.*;

public class A {
    String pwd;

    A(String x) {
        pwd = x;
    }

    boolean login(String e) {
        return e.equals(pwd);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String io = s.next();

        A obj = new A(io);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter login pwd: ");
            String e = s.next();
            if (obj.login(e)) {
                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Incorrect pwd, try again.");
            }
            if (i == 2) {
                System.out.println("Login failed after 3 attempts.");
            }
        }

        s.close();
    }
}
