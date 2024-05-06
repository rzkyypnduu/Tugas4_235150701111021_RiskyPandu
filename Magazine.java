public class Magazine extends Book implements BookOperations {
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }


    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine: " + getTitle() + " is already borrowed.");
        }
    }


    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Magazine: " + getTitle() + " was not borrowed.");
        }
    }
}