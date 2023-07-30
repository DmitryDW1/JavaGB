package exceptionsSeminars.seminar1;

/**
 * Задание 4.
 * Реализуйте метод checkArray(Intrger[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить, что он не null.
 * Логика:
 * 1. Если в какой-то ячейке встретился null, то необходимо оповестить об этом пользователя.
 * 2. Если null'ы встретились в нескольких ячейках, то идеально было-бы их "подсветить".
 */
public class task4 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 5, 7, 9};
        Integer[] array2 = {1, null, 6, 6, null, 8, null};
        checkArray(array1);
        checkArray(array2);
        // todo Если реализовать закомментированный код, вместо 16 строки, то приложение не упадёт.
//        try {
//            checkArray(array2);
//
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println("Продолжим");
    }

    private static void checkArray(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null)
                sb.append(i).append(' ');
        }
        if (sb.length() != 0)
            throw new RuntimeException("В массиве есть значения, равные null. Индексы: " + sb.toString());
    }

}
