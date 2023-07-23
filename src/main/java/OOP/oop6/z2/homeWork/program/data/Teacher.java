package OOP.oop6.z2.homeWork.program.data;

import OOP.oop6.z2.homeWork.program.model.User;

import java.time.LocalDate;
import java.util.List;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, LocalDate birthDate, int teacherId) {
        super(name, birthDate);
        this.teacherId = teacherId;
    }
    public Teacher() {

    }

    public List<Teacher> create (List<Teacher> teachers){
        for (int i = 0; i < 5; i++) {
            Teacher teacher = new Teacher("Teacher" + i, LocalDate.now(), ++teacherId);
            teachers.add(teacher);
        }
        return teachers;
    }
    @Override
    public String toString() {
        return "ID: " + teacherId + " " + super.toString() +  '\n';
    }
}
