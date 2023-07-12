package OOP.oop3.Game;

public class Answer {

    private int bulls;
    private int cows;
    public Answer(int bulls, int cows, String input) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }
    public Answer(){

    }

    @Override
    public String toString() {
        return "быки = " + bulls +
                ", коровы = " + cows;
    }
}
