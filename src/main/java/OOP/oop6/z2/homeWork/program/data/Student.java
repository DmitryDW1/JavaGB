package OOP.oop6.z2.homeWork.program.data;

import OOP.oop6.z2.homeWork.program.model.User;

import java.time.LocalDate;
import java.util.List;

public class Student extends User {
    protected int studentId;


    public Student(String name, LocalDate birthDate, int studentId) {
        super(name, birthDate);
        this.studentId = studentId;

    }
    public Student() {

    }

    public List<Student> create(List<Student> studentsList) {
        for (int i = 1; i <= 5; i++) {
                Student student = new Student("Student" + i, LocalDate.now(), ++studentId);
                studentsList.add(student);
        }
        return studentsList;
    }
    @Override
    public String toString() {
        return "ID: " + studentId + " " + super.toString() +  '\n';
    }
}
