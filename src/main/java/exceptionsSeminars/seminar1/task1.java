package exceptionsSeminars.seminar1;

/**
 * Задание 1.
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
 * заданное значение и возвращает его индекс. При этом, например:
 * 1. Если длина массива меньше некоторого заданного минимума, метод возвращает "-1" в качестве ошибки.
 * 2. Если искомый элемент не найден, метод вернёт "-2" в качестве ошибки.
 * 3. Если вместо массива пришёл "null", метод вернёт "-3".
 * 4. Придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 * Напишите метод, в котором, реализуйте взаимодействие с пользователем: метод просит искомое число у пользователя,
 * вызовет первый метод, обработает возвращённое значение и покажет читаемый результат пользователю. Например, если
 * вернулся "-2", пользователю выведется сообщение: "Искомый элемент не найден".
 */
public class task1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(stringCode(array, 7, 5));
        System.out.println(stringCode(array, 2, 3));
        System.out.println(stringCode(array, 4, 8));
        System.out.println(stringCode(null, 1, 9));
    }
    public static int checkArray(Integer[] array, int len, int value){
        if (array == null){
            return -3;
        }
        if (array.length < len){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -2;
    }
    public static String stringCode(Integer[] array, int len, int value){
        int code = checkArray(array, len, value);
        if (code == -1){
            return "Длина массива (" + array.length + ") меньше некоторого заданного минимума (" + len + ")";
        }
        if (code == -2){
            return "Искомый элемент не найден (" + value + ")";
        }
        if (code == -3){
            return "Вместо массива пришёл null";
        }
        return "Индекс найденного элемента - " + code;
    }
}
