package OOP.oop6.z2.homeWork.program.model;

import java.time.LocalDate;

public abstract class User {
    String name;
    LocalDate birthDate;
    int id;

    public User(Integer id, String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = ++id;
    }
    public User() {
    }

    public User(String name, LocalDate birthDate) {

    }

    @Override
    public String toString() {
        return "ID" + id + " Имя " + name + " Дата рождения " + birthDate;
    }
}
