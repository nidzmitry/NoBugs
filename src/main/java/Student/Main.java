package Student;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Иванов Иван");
        student.setStudentBook(345129);
        student.setScore(4.6);

        student.print();

    }
}
