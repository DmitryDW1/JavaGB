package OOP.oop6.z2.homeWork.program.view;

import OOP.oop6.z2.homeWork.program.controller.ControllerStudents;
import OOP.oop6.z2.homeWork.program.controller.ControllerTeachers;
import OOP.oop6.z2.homeWork.program.data.Student;
import OOP.oop6.z2.homeWork.program.data.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - создать список студентов" + '\n' +
                                   "2 - создать список преподавателей");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key){
                    case "1":
                        Student student = new Student();
                        List<Student> students = new ArrayList<>();
                        ControllerStudents controllerStudents = new ControllerStudents();
                        controllerStudents.create(students);
                        controllerStudents.show(students);
                        break;
                    case "2":
                        Teacher teacher = new Teacher();
                        List<Teacher> teachers = new ArrayList<>();
                        ControllerTeachers controllerTeachers = new ControllerTeachers();
                        controllerTeachers.create(teachers);
                        controllerTeachers.show(teachers);
                }
            }
        }
    }
}
