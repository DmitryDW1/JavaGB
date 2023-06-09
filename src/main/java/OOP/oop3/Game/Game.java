package OOP.oop3.Game;

public interface Game {
    public void start(int wordLength, int attempts);
    public Answer inputValue(String input);

    String getInput(String input);

    public GameStatus getGameStatus();
}
