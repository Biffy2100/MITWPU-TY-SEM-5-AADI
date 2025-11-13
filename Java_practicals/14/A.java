import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String args[]) {
        List<String> name = new ArrayList<>();
        
        name.add("Aadi"); 
        name.add("Tejas"); 
        name.add(1, "Kiran"); 

        System.out.println("Contains 'Aadi'? " + name.contains("Aadi"));
        System.out.println("List now: " + name);

        String removedAt0 = name.remove(0);
        System.out.println("Removed at index 0: " + removedAt0 + " -> " + name);

        System.out.println("Iterating with for-each:");
        int index = 0;
        for (String s : name) {
            System.out.println(index++ + ": " + s);
        }

    }
}