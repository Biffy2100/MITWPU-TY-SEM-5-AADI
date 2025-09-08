// Interface FY
interface FY {
    int rollNo = 0;
    String name = "";
    double result = 0.0;

    void acceptFYData(int rollNo, String name, double result);
    void displayFYData();
}

// Interface SY
interface SY {
    int rollNo = 0;
    String name = "";
    double result = 0.0;

    void acceptSYData(int rollNo, String name, double result);
    void displaySYData();
}

// Student class implementing both interfaces FY and SY
class Student implements FY, SY {
    int rollNoFY;
    String nameFY;
    double resultFY;

    int rollNoSY;
    String nameSY;
    double resultSY;

    // Implementing FY methods
    public void acceptFYData(int rollNo, String name, double result) {
        this.rollNoFY = rollNo;
        this.nameFY = name;
        this.resultFY = result;
    }

    public void displayFYData() {
        System.out.println("FY Data - Roll No: " + rollNoFY + ", Name: " + nameFY + ", Result: " + resultFY);
    }

    // Implementing SY methods
    public void acceptSYData(int rollNo, String name, double result) {
        this.rollNoSY = rollNo;
        this.nameSY = name;
        this.resultSY = result;
    }

    public void displaySYData() {
        System.out.println("SY Data - Roll No: " + rollNoSY + ", Name: " + nameSY + ", Result: " + resultSY);
    }
}

public class C {
    public static void main(String[] args) {
        Student student = new Student();

        student.acceptFYData(101, "Alice", 85.5);
        student.acceptSYData(101, "Alice", 90.0);

        student.displayFYData();
        student.displaySYData();
    }
}
