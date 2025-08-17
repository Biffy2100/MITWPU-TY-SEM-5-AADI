import java.util.Scanner;
public class f {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<high;i++){
            System.out.print(i%2==0 ? i+" ":"");
        }
        System.out.print("\n");
        for(int i=low;i<high;i++){
            System.out.print(i%2!=0 ? i+" ":"");
        }
        sc.close();
    }
}