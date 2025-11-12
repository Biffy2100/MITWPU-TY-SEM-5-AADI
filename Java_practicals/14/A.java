
//wap to implement list interface
import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String args[]) {
        List<String> al = new ArrayList<>();

        al.add("Aadi");
        al.add("Tejas");

        System.out.println(al.contains("Aadi"));
        System.out.println(al);

    }
}