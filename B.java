import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of vector: ");
        int n = sc.nextInt();

        Vector v = new Vector(n);
.
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            int x = sc.nextInt();
            v.add(x);
        }

        System.out.println("Current size of vector: " + v.size());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }

        System.out.println("Enter index to remove: ");
        int r = sc.nextInt();
        v.removeElementAt(r);

        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);

        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }

        sc.close();
    }
}