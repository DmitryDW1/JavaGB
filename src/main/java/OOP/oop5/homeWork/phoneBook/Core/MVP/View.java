package OOP.oop5.homeWork.phoneBook.Core.MVP;

public interface View {

    Integer getIndex(Integer value);

    Integer getIndex();

    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    String getPhone();
    void setPhone(String phone);
}