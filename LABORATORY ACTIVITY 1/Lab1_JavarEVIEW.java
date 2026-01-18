import java.util.Scanner;

public class Lab1_JavaReview {

    private static final int MAX_BOOKS = 5; 
    private static String[] bookTitles = new String[MAX_BOOKS];
    private static String[] studentNames = new String[MAX_BOOKS];
    private static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    updateBookStatus(scanner);
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("You are exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // DISPLAY MENU
    private static void displayMenu() {
        
        System.out.println("");
        System.out.println("Campus Library Management System");
        System.out.println("");
        System.out.println("1. Add a new book (Max. 5 books.)");
        System.out.println("2. Update book status (Borrowed/Available)");
        System.out.println("3. Show all books");
        System.out.println("4. Generate a book report");
        System.out.println("5. Exit");
    }

   // BOOK COUNT
    private static void addBook(Scanner scanner) {
        if (bookCount < MAX_BOOKS) {
            System.out.println("");
            System.out.print("Enter the title of the book to add: ");
            String title = scanner.nextLine();
            bookTitles[bookCount] = title;
            studentNames[bookCount] = null;
            bookCount++;
            System.out.println("");
            System.out.println("'" + title + "' has been added to the library.");
        } else {
            System.out.println("");
            System.out.println("The library is full. You can't add more books.");
        }
    }

    // STATUS (Available/Borrowed)
    private static void updateBookStatus(Scanner scanner) {
        showBooks();
        if (bookCount == 0) {
            return;
        }

        System.out.print("Enter the book number (" + bookCount + ") to update: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();

        if (bookNumber > 0 && bookNumber <= bookCount) {
            int index = bookNumber - 1;
            String currentStatus = (studentNames[index] == null) ? "Available" : "Borrowed";
            String newStatus;

            if (currentStatus.equals("Available")) {
                System.out.println("");
                System.out.print("The book is currently available. Enter the borrower's name to change status to 'Borrowed': ");
                String borrower = scanner.nextLine();
                studentNames[index] = borrower;
                newStatus = "Borrowed";
            } else {
                System.out.println("");
                System.out.println("The book is currently borrowed by " + studentNames[index] + ". Do you want to return it? (yes/no): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("yes")) {
                    studentNames[index] = null;
                    newStatus = "Available";
                } else {
                    System.out.println("");
                    System.out.println("Status not updated.");
                    return;
                }
            }
            System.out.println("");
            System.out.println("Book '" + bookTitles[index] + "' status has been updated to '" + newStatus + "'.");
        } else {
            System.out.println("Invalid book number. Please enter a number between 1 and 5" + bookCount + ".");
        }
    }

   // TOTAL BOOKS
    private static void showBooks() {
        if (bookCount == 0) {
            System.out.println("The library currently has no books.");
            return;
        }

        System.out.println("Current Library Books");
        for (int i = 0; i < bookCount; i++) {
            String status = (studentNames[i] == null) ? "Available" : "Borrowed";
            System.out.println("Book " + (i + 1) + ": '" + bookTitles[i] + "' (Status: " + status + ")");
        }
    }



    // LIBRARY REPORT STATUS
   
    private static void generateReport() {
        int borrowedCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (studentNames[i] != null) {
                borrowedCount++;
            }
        }
        int availableCount = bookCount - borrowedCount;

        System.out.println("");
        System.out.println("Library Book Report");
        System.out.println("");
        System.out.println("Total number of books registered: " + bookCount);
        System.out.println("Total number of available books: " + availableCount);
        System.out.println("Total number of borrowed books: " + borrowedCount);
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M. - BSCS-2D
// AI USED: GEMINI AI - 2.5 FLASH
// CONVERSATION LINK WITH GEMINI AI: https://g.co/gemini/share/a6c90c615686
