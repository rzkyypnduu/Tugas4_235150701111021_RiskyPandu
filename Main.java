public class Main {
    public static void main(String[] args) {
  
        TextBook textbook = new TextBook("Java Programming", "John Smith", 2020, "Computer Science");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, "Science");

    
        System.out.println("-------Book Information-------");
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();
        
        
        System.out.println("-----Borrowing and Returning Books------");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook(); // Trying to return a novel that was not borrowed
    }
}