package exceptionsSeminars.seminar1.homeWork;


import java.util.Arrays;

public class task2{
    public static void main(String[] args) {
        class Answer {
            public int[] subArrays(int[] a, int[] b) {
                // Введите свое решение ниже
                int[] c;
                if (a.length == b.length) {
                    c = new int[a.length];
                    for (int i = 0; i < a.length; i++) {
                        c[i] = a[i] - b[i];
                    }
                } else {
                    c = new int [1];
                }
                return c;
            }
        }
            int[] a = {};
            int[] b = {};

                if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{4, 5, 6};
                b = new int[]{1, 2, 3};
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

