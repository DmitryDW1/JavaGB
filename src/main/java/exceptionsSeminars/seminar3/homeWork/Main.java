package exceptionsSeminars.seminar3.homeWork;

import exceptionsSeminars.seminar3.homeWork.data.UserDataException;
import exceptionsSeminars.seminar3.homeWork.io.UserDataFileWriterImpl;
import exceptionsSeminars.seminar3.homeWork.io.UserInputConsoleReader;
import exceptionsSeminars.seminar3.homeWork.view.View;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws UserDataException, IOException {
    Scanner scanner = new Scanner(System.in);
    UserInputConsoleReader inputReader = new UserInputConsoleReader();
    UserDataFileWriterImpl fileWriter = new UserDataFileWriterImpl();
    View view = new View();
    view.run(scanner, inputReader, fileWriter);
  }
}
