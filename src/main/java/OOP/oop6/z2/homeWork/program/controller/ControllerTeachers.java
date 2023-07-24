package OOP.oop6.z2.homeWork.program.controller;

import OOP.oop6.z2.homeWork.program.data.Teacher;
import OOP.oop6.z2.homeWork.program.service.DataServiceTeachers;

import java.time.LocalDate;
import java.util.List;

public class ControllerTeachers extends Teacher implements DataServiceTeachers {
    public List<Teacher> create (List<Teacher> teachers){
        for (int i = 0; i < 5; i++) {
            Teacher teacher = new Teacher("Teacher" + i, LocalDate.now(), ++teacherId);
            teachers.add(teacher);
        }
        return teachers;
    }
    @Override
    public void show(List<?> users) {
        for (Object o : users) {
            System.out.println(o.toString());
        }
    }
}
