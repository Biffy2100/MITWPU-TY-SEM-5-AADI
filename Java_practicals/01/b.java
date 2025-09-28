import java.util.Scanner;
public class b {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        System.out.println(x%2==0 ? "Even" : "Odd");
        
        sc.close();
    }
}
    