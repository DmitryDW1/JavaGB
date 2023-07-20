package OOP.oop5.homeWork.phoneBook.Core.MVP;

import OOP.oop5.homeWork.phoneBook.Core.Infrastructure.Phonebook;

public interface View {
    Integer getIndex(Integer value);

    Integer getIndex();

    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    void displayError(String message);
    void showContactNotFoundMessage(String message);
    void setContactList(Phonebook phonebook);
    void displayMessage(String message);
    void clearForm();
}