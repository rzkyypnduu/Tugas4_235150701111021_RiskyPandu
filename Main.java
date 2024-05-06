public class Main {
    public static void main(String[] args) {
        // Create objects for each type of book
        TextBook textbook = new TextBook("Java Programming", "John Smith", 2020, "Computer Science");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, "Science");

        // Display book information
        System.out.println("-------Book Information-------");
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        // Borrow and return books
        System.out.println("-----Borrowing and Returning Books------");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook(); // Trying to return a novel that was not borrowed
    }
}