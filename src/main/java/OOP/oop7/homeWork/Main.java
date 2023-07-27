package OOP.oop7.homeWork;

import OOP.oop7.homeWork.data.FileLogger;
import OOP.oop7.homeWork.model.Calculator;
import OOP.oop7.homeWork.service.Logger;
import OOP.oop7.homeWork.view.View;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger logger = new FileLogger("log.txt");
        FileReader fileReader = new FileReader("log.txt");
        Calculator calculator = new Calculator();
        View view = new View();
        view.run(calculator, logger, fileReader);
    }
}
