package exceptionsSeminars.seminar3.homeWork.interfaces;

import exceptionsSeminars.seminar3.homeWork.data.UserData;
import exceptionsSeminars.seminar3.homeWork.data.UserDataException;

public interface UserInputReader {

  UserData readUserData() throws UserDataException;

}
