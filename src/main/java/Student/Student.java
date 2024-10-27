package Student;

public class Student implements Printable {

    String name;
    int studentBook;
    double score;

    public String getName(){
        return name;
    }
    public int getStudentBook(){
        return studentBook;
    }
    public double getScore(){
        return score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentBook(int studentBook){
        this.studentBook = studentBook;
    }

    public void  setScore(double score){
        this.score = score;

    }

    @Override
    public void print() {
        System.out.println("Имя студента: " + this.name + ", Номер зачетной книжки: " + this.studentBook + ", Средний балл: "+ this.score);
    }
}
