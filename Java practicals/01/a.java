import java.util.Scanner;
public class a {
            
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        int ans=0;
             
        if(x>y && x>z) ans=x;
        
        else if(y>x && y>z) ans=y;
        
        else ans=z;

        System.out.println("The maximum value is: " + ans);
        scanner.close();
    }
}