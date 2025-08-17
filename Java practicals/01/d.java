import java.util.*;
public class d {
public static void main(String[] args) throws Exception {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int r=0;
        int sum=0;
        
        while(num1>0){
            r=num1%10;
            sum+=r;
            num1/=10;   
            System.out.print(r);
        }
        System.out.print("\n"+sum);

        sc.close();
    }
}

