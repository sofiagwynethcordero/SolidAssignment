package SolidAssignment;

public class LibraryEjournal implements Ejournal {
    @Override
    public void borrow(String title) {
        System.out.println("borrowing e-journal: " + title);
    }
}