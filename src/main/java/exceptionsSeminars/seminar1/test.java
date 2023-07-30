package exceptionsSeminars.seminar1;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2));
        tryArray(arrayList);
    }
    private static void tryArray(ArrayList<Integer> arrayList){
        if (arrayList.size() < 3){
            System.out.println(-1);
        }else {
            System.out.println(arrayList.size());
        }
    }
}
