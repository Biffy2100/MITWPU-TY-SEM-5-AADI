import java.util.Scanner;

class SY {
    static Scanner sc = new Scanner(System.in); // Shared Scanner
    int roll;
    String name;
    double per;

    // Accept roll, name, and percentage with proper input handling
    void acceptData() {
        System.out.println("Enter roll no:");
        roll = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter percentage:");
        per = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    void displayData() {
        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);
    }
}

interface FY {
    int yoga = 5;

    void display();
}

// Use PascalCase for class name
class Student extends SY implements FY {
    int mobile;

    void accept_m() {
        super.acceptData();
        System.out.println("Enter mobile no:");
        mobile = SY.sc.nextInt();
        SY.sc.nextLine(); // consume leftover newline
    }

    public void display() {
        super.displayData();
        System.out.println("Mobile no: " + mobile);
        System.out.println("Yoga marks: " + yoga);
    }
}

public class C2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept_m();
        s.display();
    }
}
