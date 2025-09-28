import java.util.Scanner;
public class c {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Size:"); 
        int size = sc.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Elements:");

        for (int i=0;i<size;i++) { 
            
            System.out.print((i+1)+":"); 
            numbers[i] = sc.nextInt(); 
            sum += numbers[i]; 

        }
        System.out.println(sum); 
        sc.close(); 
    }
}
