package exceptionsSeminars.seminar2;

import java.util.Collections;
import java.util.List;

public class exUnsupportedOperation {
    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
