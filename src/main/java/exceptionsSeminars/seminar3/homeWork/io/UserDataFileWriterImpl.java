package exceptionsSeminars.seminar3.homeWork.io;

import exceptionsSeminars.seminar3.homeWork.data.UserData;
import exceptionsSeminars.seminar3.homeWork.interfaces.UserDataFileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;


public class UserDataFileWriterImpl implements UserDataFileWriter {

  @Override
  public void writeUserData(UserData userData) throws IOException {
    FileWriter writer = new FileWriter("src/main/java/exceptionsSeminars/seminar3/homeWork/" +
            userData.getLastName(), true);
    String userDataString = String.join(" ", userData.getLastName(), userData.getFirstName(),
        userData.getMiddleName(), userData.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
        String.valueOf(userData.getPhoneNumber()), userData.getGender().toString());
    writer.write(userDataString + "\n");
    writer.close();
    }
}
