package exceptionsSeminars.seminar3.homeWork.io;

import exceptionsSeminars.seminar3.homeWork.data.*;
import exceptionsSeminars.seminar3.homeWork.interfaces.IuserDataException;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserInputDataParse;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserInputReader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class UserInputConsoleReader implements UserInputReader, UserInputDataParse, IuserDataException {
  @Override
  public UserData readUserData() {
    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        dataLength(data);
        String lName = parseLastName(data[0]);
        String fName = parseFirstName(data[1]);
        String mName = parseMiddleName(data[2]);
        LocalDate dateOfBirth = parseDateOfBirth(data[3]);
        long phoneNumber = parsePhoneNumber(data[4]);
        Gender gender = parseGender(data[5]);
        return new UserData(lName, fName, mName, dateOfBirth, phoneNumber, gender);
      } catch (UserDataException | ParseException | NumberFormatException e) {
        System.out.println("Ошибка: " + e.getMessage());
      }
    }
  }

  @Override
  public String parseLastName(String lName) throws ParseException {
    if (lName.toLowerCase().matches("^[a-zа-яё]*$")) {
      return lName;
    } else {
      System.out.println(Colors.RED + lName + Colors.RESET);
      throw new ParseException("Фамилия должна содержать только символы алфавита" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }

  @Override
  public String parseFirstName(String fName) throws ParseException {
    if (fName.toLowerCase().matches("^[a-zа-яё]*$")) {
      return fName;
    } else {
      System.out.println(Colors.RED + fName + Colors.RESET);
      throw new ParseException("Имя должно содержать только символы алфавита" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }

  public String parseMiddleName(String mName) throws ParseException {
    if (mName.toLowerCase().matches("^[a-zа-яё]*$")) {
      return mName;
    } else {
      System.out.println(Colors.RED + mName + Colors.RESET);
      throw new ParseException("Отчество должно содержать только символы алфавита" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }
  @Override
  public LocalDate parseDateOfBirth(String dateOfBirthString) throws ParseException {
    try {
      return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    } catch (Exception e) {
      System.out.println(Colors.RED + dateOfBirthString + Colors.RESET);
      throw new ParseException("Неверный формат даты рождения" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }
  @Override
  public long parsePhoneNumber(String phoneNumberString) throws ParseException {
    try {
      return Long.parseLong(phoneNumberString);
    } catch (NumberFormatException e) {
      System.out.println(Colors.RED + phoneNumberString + Colors.RESET);
      throw new ParseException("Номер телефона может содержать только цифры" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }

  @Override
  public Gender parseGender(String genderString) throws ParseException {
    if (genderString.equalsIgnoreCase("m")) {
      return Gender.MALE;
    } else if (genderString.equalsIgnoreCase("f")) {
      return Gender.FEMALE;
    } else {
      System.out.println(Colors.RED + genderString + Colors.RESET);
      throw new ParseException("Неверный указан пол пользователя" + "\n" +
              Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }
  @Override
  public String[] dataLength(String[] data) throws UserDataException {
   if (data.length == 6){
     return data;
    }else {
     throw new UserDataException("Нехватает информации о пользователе" + "\n" +
             Colors.RED_BACKGROUND + "Повторите ввод данных!" + Colors.RESET);
    }
  }
}