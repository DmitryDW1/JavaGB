package exceptionsSeminars.seminar3.task2;

import java.io.IOException;


public class Task2 implements AutoCloseable{
    private Integer count = 0;

//    public Counter(int count) {
//        this.count = count;
//    }

    public void add() throws IOException {
        checkCLose();
        this.count++;
    }

    private void checkCLose() throws IOException {
        if (this.count == null) {
            throw new IOException("Счетчик пустой");
        }
    }


    public Integer getCount() throws IOException {
        checkCLose();
        return count;
    }
    @Override
    public void close() throws Exception {
        this.count = null;
    }
}
