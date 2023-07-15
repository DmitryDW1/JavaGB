package OOP.oop5.program.service;

import OOP.oop5.program.data.Student;

import java.util.List;

public class UserService implements DataService{
    List<Student>studentList;
    @Override
    public void create(List<Student> students) {
        this.studentList = studentList;
    }

    @Override
    public List<Student> read() {

        return studentList;
    }
}
