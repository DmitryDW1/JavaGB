package OOP.oop6.z2.homeWork.program.controller;

import OOP.oop6.z2.homeWork.program.data.Teacher;
import OOP.oop6.z2.homeWork.program.service.DataServiceTeachers;

import java.util.List;

public class ControllerTeachers implements DataServiceTeachers {

    //    @Override
//    public List<Teacher> create(List<Teacher> users) {
//        return null;
//    }
    @Override
    public void show (List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }
}
