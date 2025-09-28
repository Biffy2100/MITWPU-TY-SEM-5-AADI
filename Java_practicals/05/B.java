import java.util.*;

class Book {
    String author, title, publisher;

    void getdataB() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter author name: ");
        author = s1.next();

        System.out.println("Enter title: ");
        title = s1.next();

        System.out.println("Enter publisher: ");
        publisher = s1.next();

    }

    void displayB() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publiser: " + publisher);
    }

}

class BookInfo extends Book {
    int p, sp;

    void getdataBI() {
        super.getdataB();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter price: ");
        p = s2.nextInt();
        System.out.println("Enter stock position: ");
        sp = s2.nextInt();

    }

    void displayBI() {
        super.displayB();

        System.out.println("Price: " + p);
        System.out.println("Stock Position: " + sp);
    }
}

class BookSales extends BookInfo {
    int nc;

    void getdataBS() {
        super.getdataBI();
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter number of copies sold: ");
        nc = s3.nextInt();
    }

    void revenue() {
        int r = nc * super.p;
        System.out.println("Number of copies sold:  " + nc);
        System.out.println("Revenue: " + r);
    }
}

public class B {
    public static void main(String[] args) {
        BookSales b = new BookSales();
        b.getdataBS();
        System.out.println("\nBook Details:");
        b.displayBI();
        b.revenue();
    }
}
