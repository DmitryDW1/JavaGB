package exceptionsSeminars.seminar3.homeWork.view;

import exceptionsSeminars.seminar3.homeWork.data.Colors;
import exceptionsSeminars.seminar3.homeWork.data.UserData;
import exceptionsSeminars.seminar3.homeWork.data.UserDataException;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserDataFileWriter;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserInputReader;

import java.io.IOException;
import java.util.Scanner;

public class View{


    public void run(Scanner scanner, UserInputReader inputReader, UserDataFileWriter fileWriter) {
        System.out.println("Введите данные в через пробел: Фамилия Имя Отчество Дата рождения " +
                "(dd.mm.yyyy) Номер телефона (только цифры) Пол (f или m)");
        try {
            UserData userData = inputReader.readUserData();
            System.out.println("Сохранить данные? (y/n)");
            String key = scanner.next();
            System.out.print("\033[H\033[J");
            saveData(fileWriter, key, userData);
        } catch (UserDataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void saveData(UserDataFileWriter fileWriter, String key, UserData userData) throws IOException {
            switch (key) {
                case "y" -> {
                    fileWriter.writeUserData(userData);
                    System.out.println("Данные успешно записаны в файл: " + userData.getLastName() + "\n" +
                            "Программа завершила работу.");

                }
                case "n" -> System.out.println("Данные о последнем пользователе не сохранены по выбору оператора."
                        + "\n" + "Программа завершила работу.");
                default -> throw new IOException(Colors.RED_BRIGHT + "Нужно было выбрать 'y' или 'n'. " + Colors.RESET +
                        "\n" + "Данные о последнем пользователе не сохранены." + "\n" +
                        "Программа завершила работу." );
            }
        }
    }
