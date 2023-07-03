package OOP.oop1.cw2;

public class Main {
    public static void main(String[] args) {
        CreditAccaunt credit = new CreditAccaunt("Иван Петров", 12345, 1000.0, 10.0);
        SafeAccaunt safe = new SafeAccaunt("Иван Петров", 123, 300.0, 8.0);
        System.out.println(credit.getBalance());
        credit.calculateInteresr();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
