package OOP.oop3.z1;

public enum Month {
    JAN,FEB,APR(4),MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
    private int number;

    Month() {
    }
    Month(int number) {
        this.number = number;
    }

}
