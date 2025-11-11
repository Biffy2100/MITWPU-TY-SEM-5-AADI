
interface noParam {
    void check();
}

interface param {
    void check(int marks);
}

interface Mulaparam {
    void check(int marks, String name);
}

public class A {
    public static void main(String[] args) {
        noParam a = () -> {
            System.out.println("This is a mic check");
        };

        a.check();

        param b = (int marks) -> {
            System.out.println("Marks are - " + marks);
        };

        b.check(55);
        Mulaparam c = (marks, name) -> {
            System.out.println("Name: " + name + ", Marks: " + marks);
        };

        c.check(55, "Aadi");
    }
}
