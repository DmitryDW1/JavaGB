package OOP.oop6.z2.homeWork.program.controller;

import OOP.oop6.z2.homeWork.program.service.DataServiceTeachers;

import java.util.List;

public class ControllerTeachers implements DataServiceTeachers {
    @Override
    public void show(List<?> users) {
        for (Object o : users) {
            System.out.println(o.toString());
        }
    }
}
