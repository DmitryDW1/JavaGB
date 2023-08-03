package OOP.oop7.homeWork.data;


import OOP.oop7.homeWork.service.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private final String logString;
    public FileLogger (String logString){
        this.logString = logString;
    }

    @Override
    public void setTextLog(String message) {
        try
            (BufferedWriter writer = new BufferedWriter(new FileWriter(logString, true))) {
            writer.write( message + '\n');
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
}
