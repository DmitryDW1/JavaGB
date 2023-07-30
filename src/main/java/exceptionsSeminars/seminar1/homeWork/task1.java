package exceptionsSeminars.seminar1.homeWork;

public class task1 {
    public static void main(String[] args) {
        class Answer {
            public static void arrayOutOfBoundsException() {
                // Напишите свое решение ниже
                int[] array={1,2,3};
                System.out.println(array[4]);
            }

            public static void divisionByZero() {
                // Напишите свое решение ниже
                int x = 3;
                int y = 0;
                int z = x / y;
                System.out.println(z);
            }

            public static void numberFormatException() {
                // Напишите свое решение ниже
                String string = "Hello";
                int num = Integer.parseInt(string);
                System.out.println(num);
            }
        }
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
