package exceptionsSeminars.seminar3.homeWork.interfaces;

import exceptionsSeminars.seminar3.homeWork.data.UserData;

import java.io.IOException;

public interface UserDataFileWriter {

  void writeUserData(UserData userData) throws IOException;

}
