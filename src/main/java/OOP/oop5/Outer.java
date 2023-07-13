package OOP.oop5;

public class Outer {

    public Outer() {
    }

    /**
     * внутренний класс начало
     */
    class Inner {
        int innerValue;
        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();
//            innerMethod();
        }
    }
    //todo конец внутреннего класса

    /**
     * начало вложенного класса
     */
    static class Inner2 {
        int innerValue;
        public Inner2(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            System.out.println(outerValue);
//            outerMethod();
//            innerMethod();
        }
    }
    // todo конец вложенного класса
    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        outerMethod();
//        innerMethod();
    }
    int outerValue;
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
        Inner2 inner2 = new Inner2(10); // может существовать отдельно (static)
        System.out.println("Введи координату: ");
        class Point{  // локальный класс
            int x;
            public Point(int x) {
                this.x = x;
            }
            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }
        Point point = new Point(3);
        System.out.println("point = " + point);
    }
}
