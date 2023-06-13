package Seminar1.HomeWork;

import java.util.Scanner;

public class HW_Exes1_1 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scaner = new Scanner(System.in);
        String s = scaner.nextLine();
        System.out.println("reverseWords(str) = " + reverseWords(s));
        scaner.close();
    }

    /**
     * @apiNote Учитывая входную строку s, измените порядок слов в обратном порядке.
     * Слово определяется как последовательность символов без пробелов.
     * Слова в s будут разделены по крайней мере одним пробелом.
     * Возвращает строку слов в обратном порядке, объединенную одним пробелом.
     * Обратите внимание, что s может содержать начальные или конечные пробелы или
     * несколько пробелов между двумя словами. Возвращаемая строка должна содержать
     * только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
     */
    private static String reverseWords(String s) {
        String[] workstr = s.trim().split("\\s+");
        for(int i = 0; i < workstr.length / 2; i++) {
            String temp = workstr[i];
            workstr[i] = workstr[workstr.length - i - 1];
            workstr[workstr.length - i - 1] = temp;
        }
        String newworkstr = String.join(" ", workstr);
        return newworkstr;
    }
}
