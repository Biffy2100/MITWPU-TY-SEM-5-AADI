import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 10;

        try {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have gone out of bounds :/");
        } finally {
            System.out.println("Sucessfull exceuted program");
        }

        sc.close();
    }
}
