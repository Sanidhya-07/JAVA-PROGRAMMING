
public class book {
    // static variable associated with class not with its objects
    static int totalBooks;

    // instance variable
    String title;
    String author;
    int isbnNo;
    boolean isBorrowed;

    // parameterized constructor
    book(String title, String author, int isbnNo) {
        this.title = title;
        this.author = author;
        this.isbnNo = isbnNo;

        totalBooks++;
    }

    // methods
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        } else {
            System.out.println("Enjoy your book");
            isBorrowed = true;

        }
    }

    void returnBook() {
        if (isBorrowed) {
            System.out.println("please drop a review.");
            isBorrowed = false;
        } else {
            System.out.println("Book is already in labrary.");
        }
    }

    // Static method
    static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {

        // object creation
        book firstBook = new book("wings", "Sanidhya", 0001);
        book secondBook = new book("Dogs", "Prem", 0002);

        firstBook.borrowBook();
        firstBook.borrowBook();
        firstBook.returnBook();
        firstBook.returnBook();

        System.out.println(book.getTotalBooks());
    }
}
