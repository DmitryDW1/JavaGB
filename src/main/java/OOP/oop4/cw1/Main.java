package OOP.oop4.cw1;

public class Main {
    public static void main(String[] args) {
        //Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
        //Посмотреть с какими ошибками можно столкнуться и исправить данное
        //решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj()); // Каждый раз надо делать каст
        System.out.println("sum = " + sum);
        // разрастается
        intBox2.setObj(10);
//        intBox2.setObj("10"); //засетить  могут что и где угодно
        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){// Каждый раз надо проверять каст
            // + если объектов много if разрастается
            int sum2 = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
            System.out.println("sum2 = " + sum2);
        }
        GenBox<Integer> gen1 = new GenBox(15);//за счет предопределения каст ненужен
        GenBox<Integer> gen2 = new GenBox(10);
        int sum3 = gen1.getObj() + gen2.getObj();
        System.out.println("sum3 = " + sum3);
        //разрастается...
//        gen1.setObj("10");// ошибка при компиляции

    }
}
