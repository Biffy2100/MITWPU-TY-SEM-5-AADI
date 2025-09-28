class Cube {
    int l, b, h;
    // Constructor 1: All dimensions
    Cube(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // Constructor 2: Cube (all sides equal)
    Cube(int side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    // Constructor 3: Default values
    Cube() {
        this.l = 1;
        this.b = 1;
        this.h = 1;
    }

    int volume() {
        return l * b * h;
    }
}

public class a {
    public static void main(String[] args) {
        Cube c1 = new Cube(5, 10, 15);    // Using all dimensions
        Cube c2 = new Cube(7);            // Cube with all sides equal
        Cube c3 = new Cube();             // Default cube

        System.out.println("Volume of c1: " + c1.volume());
        System.out.println("Volume of c2: " + c2.volume());
        System.out.println("Volume of c3: " + c3.volume());
    }
}
