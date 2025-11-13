import java.util.List;
import java.util.LinkedList;

public class B {
    public static void main(String[] args) {
        List<Integer> marks = new LinkedList<>();

        marks.add(50);
        marks.add(40);
        marks.add(30);

        System.out.println(marks.contains(40));

        marks.set(1,43);
        marks.remove(0);
        System.out.println("The values are" + marks);
    } 
}
