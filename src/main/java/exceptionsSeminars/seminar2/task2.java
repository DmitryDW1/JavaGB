package exceptionsSeminars.seminar2;

public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double intArray [] = {1, 2, 3, 5, 5, 5, 3, 5, 5, 3};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
