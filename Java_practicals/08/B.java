import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];

        try {

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have gone out of bounds :/");
        } finally {
            System.out.println("Sucessfull exceuted program");
            sc.close();
        }
    }
}
