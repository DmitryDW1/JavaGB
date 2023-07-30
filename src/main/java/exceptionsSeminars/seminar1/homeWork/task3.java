package exceptionsSeminars.seminar1.homeWork;

import java.util.Arrays;

public class task3{
    public static void main(String[] args) {
        class Answer {
            public int[] subArrays(int[] a, int[] b) {
                // Введите свое решение ниже
                int[] c;
                try{
                    if (a.length == b.length) {
                        c = new int[a.length];
                        for (int i = 0; i < a.length; i++) {
                            c[i] = a[i] / b[i];
                        }
                    } else {
                        c = new int [1];
                    }
                    return c;
                } catch (Exception e) {
                    throw new RuntimeException("На ноль делить нельзя");
                }

            }
        }
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
