package OOP.oop5.program.data;

import java.time.LocalDate;

public class Teacher extends User{
    int teacherId;

    public Teacher(String name, LocalDate birthDate, int teacherId) {
        super(name, birthDate);
        this.teacherId = teacherId;
    }
}
