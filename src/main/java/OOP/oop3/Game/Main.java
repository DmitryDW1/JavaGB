package OOP.oop3.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        LogGame log = new LogGame();
        getAbstractGame(log.getLog());
    }
    private static AbstractGame getAbstractGame(ArrayList log) {
        System.out.println("Выберите игру: ");
        System.out.println("1 - игра в числа");
        System.out.println("2 - игра в русские слова");
        System.out.println("3 - игра в английские слова");
        Scanner scannerGame = new Scanner(System.in);
        int choiceGame = scannerGame.nextInt();
        AbstractGame game = null;
        if (choiceGame == 1) {
            game = new NumberGame();
        }
        if (choiceGame == 2) {
            game = new RuGame();
        }
        if (choiceGame == 3) {
            game = new EnglishGame();
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину слова: ");
        int wordLength = scanner.nextInt();
        System.out.println("Введите количество попыток: ");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        game.start(wordLength, tryCount);
        boolean isFinish = false;
        boolean isWin = false;
        while (!(isFinish || isWin)) {
            Answer answer = game.inputValue(scanner.nextLine());
            if (answer != null) {
                System.out.println("answer = " + answer);
                log.add(answer);
            }
            isFinish = game.getGameStatus() == GameStatus.FINISH;
            isWin = game.getGameStatus() == GameStatus.WIN;
        }
        if (isWin) {
            String info = "Вы победили!";
            System.out.println(info);
            log.add(info);
            log.add("-------");
            restart(log);
        } else {
            String info = "Вы проиграли!";
            System.out.println(info);
            log.add(info);
            log.add("-------");
            restart(log);
        }
        return game;
    }
    private static void restart(ArrayList log) {
        System.out.println("Сыграть ещё раз? (y/n)");
        System.out.println("Посмотреть журнал (l)");
        Scanner scannerNewGame = new Scanner(System.in);
        String newGame = scannerNewGame.nextLine();
        switch (newGame){
            case "y": getAbstractGame(log);
            case "n":
                System.out.println("До новых встреч!!!");
            case "l":
                for (Object o : log) {
                    System.out.println(o);
                }
                break;
            default:
                System.out.println("Непонимаю... отключаюсь");
                break;
        }
    }
}
