package OOP.oop6.z2.homeWork.program.controller;

import OOP.oop6.z2.homeWork.program.data.Student;
import OOP.oop6.z2.homeWork.program.service.DataServiceStudents;

import java.util.List;

public class ControllerStudents extends Student implements DataServiceStudents {
//    public List<Student> send (List<Student> students) {
//        UserService userService = new UserService();
//        userService.read(students);
//        return students;
//    }
    @Override
    public void show(List<?> users) {
        for (Object o : users) {
            System.out.println(o.toString());
        }
    }
}
