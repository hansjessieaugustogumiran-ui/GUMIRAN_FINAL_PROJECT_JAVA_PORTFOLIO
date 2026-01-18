public class MyBookList {

    public static void main(String[] args) {
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        System.out.println("");
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);

        System.out.println("");
        System.out.println("Initial Book Details.");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
        System.out.println("");
        System.out.println("Updating Pages and Author");

        book1.changePage(50); 
        book3.changePage(100); 
        book5.changePage(42); 
        book4.changeAuthor("Jane Smith"); 
        System.out.println("");
        System.out.println("Updated Details for Changed Books");
        book1.displayDetails();
        book3.displayDetails();
        book5.displayDetails();
        book4.displayDetails();

        Book[] myBooks = {book1, book2, book3, book4, book5};
        System.out.println("Books Published After 2010");
        for (Book book : myBooks) {
            if (book.getYearPublished() > 2010) {
                System.out.println("");
                System.out.println(book.getTitle()); 
            }
        }
    }

} 

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0;
    }

    public void changePage(int newPage) {
        if (newPage >= 0) {
            this.currentPage = newPage;
            System.out.println("");
            System.out.println("Current page of '" + this.title + "' changed to " + newPage + ".");
        } else {
            System.out.println("");
            System.out.println("Error: Page number cannot be negative.");
        }
    }
    
    public void changeAuthor(String newAuthor) {
        String oldAuthor = this.author;
        this.author = newAuthor;
        System.out.println("");
        System.out.println("Author of '" + this.title + "' changed from " + oldAuthor + " to " + newAuthor + ".");
    }

    public void displayDetails() {
        System.out.println("");
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", Current Page: " + currentPage);
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: GEMINI AI (2.5 FLASH)
// CONVERSATION WITH GEMINI AI (LINK): https://g.co/gemini/share/5f906d59f93a
