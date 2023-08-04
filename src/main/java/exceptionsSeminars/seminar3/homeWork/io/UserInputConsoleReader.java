package exceptionsSeminars.seminar3.homeWork.io;

import exceptionsSeminars.seminar3.homeWork.data.Gender;
import exceptionsSeminars.seminar3.homeWork.data.ParseException;
import exceptionsSeminars.seminar3.homeWork.data.UserData;
import exceptionsSeminars.seminar3.homeWork.data.UserDataException;
import exceptionsSeminars.seminar3.homeWork.interfaces.IuserDataException;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserInputDataParse;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserInputReader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * `UserInputConsoleReader` - класс, реализующий интерфейс `UserInputReader`. Он использует
 * `Scanner` для чтения пользовательского ввода с консоли. Класс содержит метод `readUserData()`,
 * который предлагает пользователю ввести данные в определенном порядке, разделяя их пробелом. Затем
 * метод разбивает введенные данные на составляющие и выполняет их парсинг. Если формат данных
 * неверный, выбрасывается исключение `ParseException`. Если введено неверное количество данных,
 * выбрасывается `UserDataException`. Если все данные корректны, создается и возвращается объект
 * `UserData`.
 */
public class UserInputConsoleReader implements UserInputReader, UserInputDataParse, IuserDataException {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

  @Override
  public UserData readUserData() throws UserDataException {
    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        dataLength(data);
        String lName = parseLastName(data[0]);
        String fName = parseFirstName(data[1]);
        LocalDate dateOfBirth = parseDateOfBirth(data[3]);
        String mName = parseMiddleName(data[2]);
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
      System.out.println(ANSI_YELLOW + lName + ANSI_RESET);
      throw new ParseException("Фамилия должна содержать только символы алфавита " + "\n" +
              ANSI_RED_BACKGROUND + "  Повторите ввод данных!" + ANSI_RESET);
    }
  }

  @Override
  public String parseFirstName(String lName) throws ParseException {
    if (lName.toLowerCase().matches("^[a-zа-яё]*$")) {
      return lName;
    } else {
      throw new ParseException("Имя должно содержать только символы алфавита");
    }
  }

  public String parseMiddleName(String lName) throws ParseException {
    if (lName.toLowerCase().matches("^[a-zа-яё]*$")) {
      return lName;
    } else {
      throw new ParseException("Отчество должно содержать только символы алфавита");
    }
  }

  @Override
  public LocalDate parseDateOfBirth(String dateOfBirthString) throws ParseException {
    try {
      return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    } catch (Exception e) {
      throw new ParseException("Неверный формат даты рождения");
    }
  }

  @Override
  public long parsePhoneNumber(String phoneNumberString) throws ParseException {
    try {
      return Long.parseLong(phoneNumberString);
    } catch (NumberFormatException e) {
      throw new ParseException("Неверный формат номера телефона");
    }
  }

  @Override
  public Gender parseGender(String genderString) throws ParseException {
    if (genderString.equalsIgnoreCase("m")) {
      return Gender.MALE;
    } else if (genderString.equalsIgnoreCase("f")) {
      return Gender.FEMALE;
    } else {
      throw new ParseException("Неверный формат пола");
    }
  }
  @Override
  public String[] dataLength(String[] data) throws UserDataException {
   if (data.length == 6){
     return data;
    }else {
      throw new UserDataException("Введено неверное количество данных");
    }
  }
}