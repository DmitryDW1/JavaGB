package OOP.oop5.homeWork.phoneBook.Core.Models;

public class Contact implements Comparable<Contact> {
    public String firstName;
    public String lastName;
    public String phone;
    public String description;

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Contact(String firstName, String lastName, String phone, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.description = description;
    }

    public Contact(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhone() {
        return phone;
    }
    public void setPhone(){
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Contact o) {
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) obj;
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)
                && this.phone.equals(other.phone) && this.description.equals(other.description);
    }
}