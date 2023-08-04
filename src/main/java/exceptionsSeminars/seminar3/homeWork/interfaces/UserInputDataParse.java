package exceptionsSeminars.seminar3.homeWork.interfaces;

import exceptionsSeminars.seminar3.homeWork.data.Gender;
import exceptionsSeminars.seminar3.homeWork.data.ParseException;

import java.time.LocalDate;

public interface UserInputDataParse {
    String parseLastName(String lName) throws ParseException;

    String parseFirstName(String lName) throws ParseException;

    LocalDate parseDateOfBirth(String dateOfBirthString) throws ParseException;

    long parsePhoneNumber(String phoneNumberString) throws ParseException;

    Gender parseGender(String genderString) throws ParseException;
}
