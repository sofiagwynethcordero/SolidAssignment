package SolidAssignment;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Book book = new LibraryBook();
        Journal journal = new LibraryJournal();
        AudioBook audioBook = new LibraryAudioBook();
        Ejournal eJournal = new LibraryEjournal();

        student.borrowing(book, "Mathematics");
        student.borrowing(journal, "Biometrics");
        student.borrowing(audioBook, "The Education Myth");
        student.borrowing(eJournal, "A Life of Purpose");

    }
}