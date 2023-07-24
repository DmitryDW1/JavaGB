package OOP.oop6.z2.homeWork.program.data;

import OOP.oop6.z2.homeWork.program.model.User;

import java.time.LocalDate;

public class Student extends User {


    public Student(Integer id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
    }
    public Student(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public Student() {
    }
    @Override
    public String toString() {
        return super.toString() +  '\n';
    }
}
