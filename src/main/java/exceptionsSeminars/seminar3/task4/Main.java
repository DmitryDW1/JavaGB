package exceptionsSeminars.seminar3.task4;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}};
        String[][] array2 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String[][] array3 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "hello", "4"},
                {"1", "2", "3", "4"}};
        System.out.println(Task4.checkArray(array1));
        try {
            System.out.println(Task4.checkArray(array2));
        }catch (MyArrayDataException | MySizeArrayException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Task4.checkArray(array3));
        }catch (MyArrayDataException | MySizeArrayException e){
            System.out.println(e.getMessage());
        }
    }
}
