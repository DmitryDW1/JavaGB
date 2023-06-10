package Example1;

public class example2 {
    public static void main(String[] args) {

/**
 * API (Application programming interface) —
 * это контракт, который предоставляет программа.
 * «Ко мне можно обращаться так и так, я обязуюсь
 * делать то и это».
 */
//        String str = "";
//        for (int i = 0; i < 1000000; i++ ) {
//            str+= "+";


//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1000000; i++ ) {
//            sb.append("+");


//        var s = System.currentTimeMillis();
//        //String str = "";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            //str += "+";
//            sb.append("+");
//        }
//        System.out.println(System.currentTimeMillis() - s);
//        //System.out.println(str);
//        //System.out.println(sb);
/**
 * concat(): объединение строк
 * valueOf(): преобразует Object в строковое представление (завязан на toString())
 * join(): объединяет набор строк в одну с учетом разделителя
 * charAt(): получение символа по индексу
 * indexOf(): первый индекс вхождения подстроки
 * lastIndexOf(): последний индекс вхождения подстроки
 * startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
 * replace(): замена одной подстроки на другую
 * trim(): удаляет начальные и конечные пробелы
 * substring(): возвращает подстроку, см.аргументы
 * toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
 * сompareTo(): сравнивает две строки
 * equals(): сравнивает строки с учетом регистра
 * equalsIgnoreCase(): сравнивает строки без учета регистра
 * regionMatches(): сравнивает подстроки в строках
 */

//        String[] name = { "C", "е", "р", "г", "е", "й" };
//        String sk = "СЕРГЕЙ КА.";
//        System.out.println(sk.toLowerCase()); // сергей ка.
//        System.out.println(String.join("", name)); // Cергей
//        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//        // C,е,р,г,е,й
//        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));


/**
 * Для работы нужно:
 * File <имя> = new File(<полный путь к файлу>);
 * File f1 = new File("file.txt");
 * File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
 * Что предпочтительнее?
 */

    }
}

