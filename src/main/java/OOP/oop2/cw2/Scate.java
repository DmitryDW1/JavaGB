package OOP.oop2.cw2;

public class Scate implements Transport{
    @Override
    public void start() {
        System.out.println(" скейт поехал");
    }
    @Override
    public void stop() {
        System.out.println(" скейт остановился");
    }
}
