package OOP.oop5.homeWork.phoneBook.UI;

import OOP.oop5.homeWork.phoneBook.Core.Infrastructure.Phonebook;
import OOP.oop5.homeWork.phoneBook.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
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
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);        
    }

    @Override
    public void displayError(String message) {

    }

    @Override
    public void showContactNotFoundMessage(String message) {

    }

    @Override
    public void setContactList(Phonebook phonebook) {

    }

    @Override
    public void displayMessage(String message) {

    }

    @Override
    public void clearForm() {

    }

}
