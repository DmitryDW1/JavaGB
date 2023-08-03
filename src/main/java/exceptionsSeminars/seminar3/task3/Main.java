package exceptionsSeminars.seminar3.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NotFile {
        try {
            int a = 5 / 0;
        }catch (ArithmeticException e){
            try {
                throw new DivideBuZero();
            }catch (DivideBuZero wx){
                System.out.println(wx.getMessage());
            }
        }
        int i = 0;
        try {
            Integer[] array = {1, 2, 3, 4, null, 5, 6, 7, 8, 9, 0};
            for (;i<array.length; i++){
                System.out.println(array[i]);
                array[i]++;
            }
        }catch (NullPointerException e){
            try {
                throw new NullPointerArray(i);
            }catch (NullPointerArray wx){
                System.out.println(wx.getMessage());
            }
        }
        String path = "wqeqwesdasd.txt";
        try (FileReader fileReader = new FileReader(path)) {
            int a = 5;
        }catch (FileNotFoundException e){
            try {
                throw new NotFile(path);
            }catch (NotFile ex){
                System.out.println(ex.getMessage());
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}
