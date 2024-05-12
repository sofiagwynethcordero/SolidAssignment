package SolidAssignment;

public class LibraryJournal implements Journal {
    @Override
    public void borrow(String title) {
        System.out.println("borrowing journal: " + title);
    }
}