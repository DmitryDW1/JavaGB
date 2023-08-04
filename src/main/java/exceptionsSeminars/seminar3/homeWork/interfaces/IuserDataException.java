package exceptionsSeminars.seminar3.homeWork.interfaces;

import exceptionsSeminars.seminar3.homeWork.data.UserDataException;

public interface IuserDataException {

    String[] dataLength(String[] data) throws UserDataException;
}
