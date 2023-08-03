package exceptionsSeminars.seminar3.task3;

import java.io.FileNotFoundException;

/**
 * Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное
 * для пользователя сообщение об ошибке. Создайте класс исключений, которое будет возникать при обращении к пустому
 * элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке.
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно
 * отображать понятное для пользователя сообщение об ошибке.
 */
public class Task3 {
}
class  DivideBuZero extends ArithmeticException{
    public DivideBuZero(){
        super("Деление на ноль запрещено");
    }
}
class NullPointerArray extends NullPointerException{
    public NullPointerArray(int index){
        super("Обращение к пустому элементу в массиве запрещено, индекс элемента: " + index);
    }
    public NullPointerArray(){
        super("Обращение к пустому элементу в массиве запрещено ");
    }
}
class NotFile extends FileNotFoundException{
    public NotFile(String path){
        super("Открыть несуществующий файл нельзя, ваш путь к файлу -> " + path);
    }
}