package OOP.oop2.cw2;

public class Bicycle implements Transport {
    @Override
    public void start() {
        System.out.println(" ваелосипед поехал");
    }
    @Override
    public void stop() {
        System.out.println(" ваелосипед остановился");
    }
}
