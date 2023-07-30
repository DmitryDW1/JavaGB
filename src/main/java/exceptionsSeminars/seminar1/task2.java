package exceptionsSeminars.seminar1;

/**
 * Задание 2.
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов массива.
 * При этом накладываем на метод два ограничения:
 * 1. Метод может работать только с квадратными массивами (кол-во строк = кол-во столбцов).
 * 2. В каждой ячейке может лежать значение 0 или 1.
 * Если нарушается одно из условий, метод должен выбросить RuntimeException с сообщением об ошибке.
 */
public class task2 {
    public static void main(String[] args) {
        int [][] array = {{0, 1}, {1, 0}};
        System.out.println(sumElements(array));
    }

    private static int sumElements(int[][] array) {
        if(array[0].length != array.length){
            throw new RuntimeException("Массив не является квадратным");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] !=0 && array[i][j] != 1){
                    throw new RuntimeException("Элемент  массива не равен 0 или 1");
                }else
                    sum += array[i][j];
                }
            }
        return sum;
    }
}
