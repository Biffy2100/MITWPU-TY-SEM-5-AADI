class Mobile {
    String companyName;
    double screenSize;

    public Mobile(String companyName, double screenSize) {
        this.companyName = companyName;
        this.screenSize = screenSize;
    }

    public void display() {
        System.out.println("Company Name: " + companyName + ", Screen Size: " + screenSize + " inches");
    }
}

public class b {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];
        mobiles[0] = new Mobile("Samsung", 6.5);
        mobiles[1] = new Mobile("Apple", 6.1);
        mobiles[2] = new Mobile("OnePlus", 6.7);
        mobiles[3] = new Mobile("Xiaomi", 6.4);
        mobiles[4] = new Mobile("Realme", 6.6);

        for (int i = 0; i < mobiles.length; i++) {
            mobiles[i].display();
        }
    }
}
