package OOP.oop5.homeWork.phoneBook.UI;

import OOP.oop5.homeWork.phoneBook.Core.MVP.View;

import java.util.Scanner;

public class NewConsoleView implements View {
Scanner in;
public NewConsoleView() {
    in = new Scanner(System.in);
}


    @Override
    public Integer getIndex(Integer value) {
        return null;
    }

    @Override
    public Integer getIndex() {
        return null;
    }

    @Override
public String getFirstName() {
    System.out.print("Имя: ");
    return in.nextLine();
}

@Override
public void setFirstName(String value) {
    System.out.printf("Имя: %s\n", value);
}

@Override
public String getLastName() {
    System.out.print("Фамилия: ");
    return in.nextLine();
}

@Override
public void setLastName(String value) {
    System.out.printf("Фамилия: %s\n", value);
}

@Override
public String getDescription() {
    System.out.print("ID: ");
    return in.nextLine();
}

@Override
public void setDescription(String value) {
    System.out.printf("ID: %s\n", value);
}
@Override
public String getPhone(){
    System.out.println("Телефон: ");
    return in.nextLine();
}

@Override
public void setPhone(String value) {
    System.out.printf("Телефон: %s\n", value);
}
}