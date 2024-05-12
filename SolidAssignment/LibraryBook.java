package SolidAssignment;

public class LibraryBook implements Book {
    @Override
    public void borrow(String title) {
        System.out.println("borrowing book: " + title);
    }
}