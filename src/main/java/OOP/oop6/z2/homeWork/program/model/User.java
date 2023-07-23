package OOP.oop6.z2.homeWork.program.model;

import java.time.LocalDate;

public abstract class User {
    String name;
    LocalDate birthDate;

    public User(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public User() {
    }
    @Override
    public String toString() {
        return "Имя " + name + " Дата рождения " + birthDate;
    }
}
