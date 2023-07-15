package OOP.oop5.program.view;

import OOP.oop5.program.controller.Controller;
import OOP.oop5.program.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentView {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("Дима", LocalDate.now(), i);
            students.add(student);
        }
        Controller controller = new Controller();
        controller.send(students);
        controller.show();
    }
}
