package SolidAssignment;

public class Student {
    void borrowing(Resource resource, String title) {
        System.out.print("Student is ");
        resource.borrow(title);

    }
}