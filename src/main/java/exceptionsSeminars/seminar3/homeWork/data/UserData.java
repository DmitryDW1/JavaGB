package exceptionsSeminars.seminar3.homeWork.data;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserData {

  private final String lastName;
  private final String firstName;
  private final String middleName;
  private final LocalDate dateOfBirth;
  private final long phoneNumber;
  private final Gender gender;

  public UserData(String lastName, String firstName, String middleName, LocalDate dateOfBirth,
      long phoneNumber, Gender gender) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
  }
}
