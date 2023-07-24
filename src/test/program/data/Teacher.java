package OOP.oop6.z2.homeWork.program.data;

import OOP.oop6.z2.homeWork.program.model.User;

import java.time.LocalDate;

public class Teacher extends User {
    protected int teacherId;

    public Teacher(String name, LocalDate birthDate, int teacherId) {
        super(name, birthDate);
        this.teacherId = teacherId;
    }
    public Teacher() {

    }


    @Override
    public String toString() {
        return "ID: " + teacherId + " " + super.toString() +  '\n';
    }
}
