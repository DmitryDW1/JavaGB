package OOP.oop2.cw1;

public class Tiger extends Cat{
    static int count;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
