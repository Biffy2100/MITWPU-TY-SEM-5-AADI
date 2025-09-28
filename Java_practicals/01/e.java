import java.util.*;
public class e {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        sc.close();

        for(int i=rows;i>0;i--){
            for(int j=i-1;j>=0;j--){
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
