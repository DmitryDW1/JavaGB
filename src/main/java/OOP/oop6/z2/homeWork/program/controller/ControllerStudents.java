package OOP.oop6.z2.homeWork.program.controller;

import OOP.oop6.z2.homeWork.program.data.Student;
import OOP.oop6.z2.homeWork.program.service.DataServiceStudents;

import java.time.LocalDate;
import java.util.List;

public class ControllerStudents extends Student implements DataServiceStudents {
//    public List<Student> send (List<Student> students) {
//        UserService userService = new UserService();
//        userService.read(students);
//        return students;
//    }
    public List<Student> create(List<Student> studentsList) {
        for (int i = 1; i <= 5; i++) {
            Student student = new Student("Student" + i, LocalDate.now());
            studentsList.add(student);
    }
    return studentsList;
}
    @Override
    public void show(List<?> users) {
        for (Object o : users) {
            System.out.println(o.toString());
        }
    }
}
