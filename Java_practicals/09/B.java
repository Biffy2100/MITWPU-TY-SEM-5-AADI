import java.util.*;

class Even extends RuntimeException {
    public Even(String str) {
        super(str);
    }
}

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int a = sc.nextInt();

        try {
            if (a % 2 != 0) {
                throw new Even("The number is not even!!");
            } else {
                System.out.println("Number is even");
            }
        } catch (Exception e) {
            System.out.println("Exception detected");
        } finally {
            System.out.println("Code excuted");
            sc.close();
        }
    }
}
