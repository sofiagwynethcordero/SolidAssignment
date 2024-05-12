package SolidAssignment;

public class LibraryAudioBook implements AudioBook {
    @Override
    public void borrow(String title) {
        System.out.println("borrowing audio book: " + title);
    }
}