package exceptionsSeminars.seminar3;
        /**
         * Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
         * (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем
         * исключение, которое вызвал метод doSomething().
         */

public class Task1 {
//    public static void main(String[] args) {
//        try {
//            doSomething();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void doSomething() throws Exception{
//
//    }

    // Второй вариант. Указывая RuntimeException, не нужен блок TryCatch
    public static void main(String[] args) {
        doSomething();
    }
    public static void doSomething() throws RuntimeException{

    }
//    public static void main(String[] args) {
//        try {
//            doSomething();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//            /**
//             * только checked исключения
//             */
//            public static void doSomething() throws Exception {
//                throw new Exception();
//            }
}
