package exceptionsSeminars.seminar2.homeWork;

public class task2 {
    public static void main(String[] args) {
        // Исходный код
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        // Первый вариант изменения
//        int d = 0;
//        try {
//            double catchedRes1 = 8 / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
        // Второй вариант изменения
//        double intArray [] = {1, 2, 3, 5, 5, 5, 3, 5, 5, 3};
//        int d = 0;
//        try {
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        // Третий вариант изменения
        int intArray [] = {1, 2, 3, 5, 5, 5, 3, 5, 5, 3};
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
