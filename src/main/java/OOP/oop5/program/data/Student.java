package OOP.oop5.program.data;

import java.time.LocalDate;

public class Student extends User{
    int studentId;

    public Student(String name, LocalDate birthDate, int studentId) {
        super(name, birthDate);
        this.studentId = studentId;
    }
}
