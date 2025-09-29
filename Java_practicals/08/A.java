public class A {
    public static void main(String[] args) {

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 not possible");
        } finally {
            System.out.println("You have finished executing the code!");
        }

    }
}
