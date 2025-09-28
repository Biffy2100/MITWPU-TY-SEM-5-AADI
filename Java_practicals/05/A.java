
class Book {
    String author, title, publisher;

    Book(String a, String t, String p) {
        author = a;
        title = t;
        publisher = p;
    }

    void display() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }
}

class BookInfo extends Book {
    int price, sp;

    BookInfo(String a, String t, String p, int price, int sp) {
        super(a, t, p);
        this.price = price;
        this.sp = sp;
    }

    void show() {
        super.display();
        System.out.println("Price: " + price);
        System.out.println("Stock Position" + sp);
    }
}

public class A {
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("Dan Brown", "Deception Point", "Pocket Books", 450, 12);
        BookInfo b2 = new BookInfo("Madeline Miller", "Song of Achilles", "Bloomsbury", 500, 8);
        BookInfo b3 = new BookInfo("Kami Garcia & Margaret Stohl", "Beautiful Creatures", "Little, Brown", 400, 6);

        System.out.println("Details of Book 1:");
        b1.show();
        System.out.println("\nDetails of Book 2:");
        b2.show();
        System.out.println("\nDetails of Book 3:");
        b3.show();
    }
}
