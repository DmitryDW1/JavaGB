package OOP.oop2.cw1;

public class Dog extends Animal{
    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if(runDistance > 500){
            this.runDistance = 500;
            System.out.println("Ввод некорректен. Установлено максимальное значение по умолчанию");
        }else {
            this.runDistance = runDistance;
        }
        if(swimDistance > 10){
            this.runDistance = 10;
            System.out.println("Ввод некорректен. Установлено максимальное значение по умолчанию");
        }else {
            this.swimDistance = swimDistance;
        }
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance > runDistance){
            System.out.println(super.name + " не сможет пробежать");
        }else {
            System.out.println(" пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance > swimDistance){
            System.out.println(super.name + " не сможет проплыть");
        }else {
            System.out.println(" проплыл");
        }
    }
}
