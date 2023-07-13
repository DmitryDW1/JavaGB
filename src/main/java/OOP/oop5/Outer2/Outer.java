package OOP.oop5.Outer2;

public class Outer {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public void start() {
                System.out.println("Игра началась");
            }
        };
        System.out.println(game.getClass().getName());
        Game game2 = new Game() {
            @Override
            public void start() {
                System.out.println("Игра началась");
            }
        };
        System.out.println(game2.getClass().getName());
        // если видит Game(), то к Outer добавляется $ + порядковый номер
        // к Outer$1 implements Game
        // происходит override методов интерфейса
        // Outer game = new Outer();
        AbstractGame abstractGame = new AbstractGame() {
            @Override
            public void info() {
                System.out.println("Информация о игре");
            }
        };
        System.out.println(abstractGame.getClass().getName());
        abstractGame.info();
    }
}
