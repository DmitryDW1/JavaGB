package OOP.oop7.homeWork;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger log = new FileLogger("log.txt");
        Calculator calculator = new Calculator();
        View view = new View();
        view.view(calculator);
    }
}
