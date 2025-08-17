import java.util.*;


public class g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numer 1:");
        int num1 = sc.nextInt();
        System.out.print("Numer 2:");
        int num2 = sc.nextInt();
        int flag=1;
        while (flag==1) {
            
        
        System.out.print("Choose an airthmetci operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5.Exit\n");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                 System.out.println("Exiting");
                 flag=0;
            default:
                System.out.println("Invalid operation selected.");
        }
    }
    sc.close();    
}
    
}
