package OOP.oop5.program.service;

import OOP.oop5.program.data.Student;

import java.util.List;

public interface DataService {
    void create(List<Student> students);

    List<Student> read();

}
