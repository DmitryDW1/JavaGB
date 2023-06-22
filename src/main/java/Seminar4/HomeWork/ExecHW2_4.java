package Seminar4.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecHW2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверим, правильно ли будут расставлены символы:");
        String s = scanner.nextLine();
        System.out.println("isValid() = " + isValid(s));
    }

    /**
     * @apiNote Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
     * является ли входная строка допустимой.
     *
     * Входная строка допустима, если:
     *
     * Открытые скобки должны быть закрыты скобками того же типа.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждая закрывающаяся скобка имеет соответствующую открытую скобку того же типа.
     * @param s
     * @return boolean
     */
    public static boolean isValid(String s) {
        ArrayList<Character> arrayChar = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                arrayChar.add(s.charAt(i));
            }
            else if (s.charAt(i) == ')'){
                if (arrayChar.size() > 0 && arrayChar.get(arrayChar.size() - 1) == '('){
                    arrayChar.remove(arrayChar.size() - 1);
                }
                else {
                    return false;
                }
            }
            else if (s.charAt(i) == ']'){
                if (arrayChar.size() > 0 && arrayChar.get(arrayChar.size() - 1) == '['){
                    arrayChar.remove(arrayChar.size() - 1);
                }
                else {
                    return false;
                }
            }
            else if (s.charAt(i) == '}'){
                if (arrayChar.size() > 0 && arrayChar.get(arrayChar.size() - 1) == '{'){
                    arrayChar.remove(arrayChar.size() - 1);
                }
                else {
                    return false;
                }
            }
        }
        return (arrayChar.size() == 0) ;
    }
}
