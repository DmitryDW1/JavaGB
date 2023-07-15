package OOP.oop5.program.controller;

import OOP.oop5.program.data.Student;
import OOP.oop5.program.service.UserService;

import java.util.List;

public class Controller {
    public void send(List<Student> students) {
        UserService userService = new UserService();
        userService.create(students);
    }
    public List<Student>show(){
        UserService userService = new UserService();
        return userService.read();
    }
}
