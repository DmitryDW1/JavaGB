package exceptionsSeminars.seminar2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

public class tryCatchEx {
    public static void main(String[] args) {
        int x = 1;
        try {
            x = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }
        System.out.println(x);
        int y = 1;
        String test = null;
        try {
            y = 10 / 1;
//            System.out.println(test.length());
            Collections.emptyList().add(new Object());
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(y);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/main/java/OOP/oop7/homeWork/view/View.java");
            fileReader.read();
        } catch (RuntimeException | FileNotFoundException e) {  //можно перечислить несколько видов ошибок
            System.out.println("Нет файла");
        } catch (IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }finally {  // выполняется всегда!
            System.out.println("finally start");
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finish");
        }
    }
}
