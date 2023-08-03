package exceptionsSeminars.seminar3.task4;

public class Task4 {
    public static int checkArray(String[][] array){
        if(array.length != 4 || array[0].length != 4) throw new MySizeArrayException(array.length, array[0].length);
        int sum = 0;
        for (String[] arr: array){
            for (String i: arr){
                try {
                    sum += Integer.valueOf(i);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
class MySizeArrayException extends RuntimeException{
    public MySizeArrayException(int row, int column){
        super("Массив должен быть 4х4, размеры вашего массива -> " + row + "x" + column);
    }
    public MySizeArrayException(){
        super("Массив должен быть 4х4");
    }
}
class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("В каком-то элементе массива преобразование не удалось");
    }
}
