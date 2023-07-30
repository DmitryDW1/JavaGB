package OOP.oop7.homeWork.view;

import OOP.oop7.homeWork.model.ComplexNum;
import OOP.oop7.homeWork.service.ICalc;
import OOP.oop7.homeWork.service.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
public class View {
    public void run(ICalc iCalc, Logger logger, FileReader fileReader) throws IOException {
        logger.setTextLog(String.valueOf(LocalDateTime.now()));
        System.out.println("При вводе значений учитывается знак (+ или -). По-умолчанию знак '+'.");
        calculations(iCalc, logger, fileReader);
    }
    private void calculations(ICalc iCalc, Logger logger, FileReader fileReader) throws IOException {
        System.out.println("Введите первое число:");
        ComplexNum number1 = number(logger);
        System.out.println("Введите второе число:");
        ComplexNum number2 = number(logger);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: +  -  *  /");
        String key = scanner.next();
        System.out.print("\033[H\033[J");
        switch (key) {
            case "+" -> System.out.println(iCalc.addition(number1, number2, logger));
            case "-" -> System.out.println(iCalc.subtraction(number1, number2, logger));
            case "*" -> System.out.println(iCalc.multiplication(number1, number2, logger));
            case "/" -> System.out.println(iCalc.division(number1, number2, logger));
        }
        repeat(scanner, iCalc ,logger, fileReader);
    }
    private void repeat(Scanner scanner, ICalc iCalc, Logger logger, FileReader fileReader) throws IOException {
        System.out.println("--------------");
        System.out.println("Считаем ещё: y");
        System.out.println("Выход: n" );
        System.out.println("Журнал: l");
        String keyAnother = scanner.next();
        System.out.print("\033[H\033[J");
        switch (keyAnother){
            case "y":
                calculations(iCalc, logger, fileReader);
            case "n":
                break;
            case "l":
                try (fileReader)
                {
                    int content;
                    while ((content = fileReader.read()) != -1) {
                        System.out.print((char) content);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                repeat(scanner, iCalc ,logger, fileReader);
        }
    }
    private ComplexNum number(Logger logger) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Действительная часть числа:");
        double matNumber = scanner.nextDouble();
        System.out.println("Мнимая часть числа:");
        double imagNumber = scanner.nextDouble();
        ComplexNum complexNum = new ComplexNum(matNumber, imagNumber);
        System.out.println(complexNum);
        logger.setTextLog("Число " + complexNum);
        return complexNum;
    }
}
