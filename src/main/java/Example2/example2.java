package Example2;

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

/**
 * Работа с файловой системой. Файлы. Ошибки
 * try {
 *  Код, в котором может появиться ошибка
 * } catch (Exception e) {
 *  Обработка, если ошибка случилась
 * }
 * finally {
 *  Код, который выполнится в любом случае
 * }
 */

//        String line = "empty";
//        try {
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created"); }
//            else {
//                BufferedReader bufReader =
//                        new BufferedReader(new FileReader(file));
//                System.out.println("file.existed");
//                line = bufReader.readLine();
//                bufReader.close(); }
//        } catch (Exception e) {
//            //e.printStackTrace();
//        } finally {
//            System.out.println(line);
//        }

//        String line = "empty";
//        try {
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created"); }
//            else {
//                BufferedReader bufReader =
//                        new BufferedReader(new FileReader(file));
//                System.out.println("file.existed");
//                line = bufReader.readLine();
//                bufReader.close(); }
//        } catch (Exception e) {
//            //e.printStackTrace();
//        } finally {
//            System.out.println(line);
//        }

/**
 * isHidden(): возвращает истину, если каталог или файл является скрытым
 * length(): возвращает размер файла в байтах
 * lastModified(): возвращает время последнего изменения файла или каталога
 * list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
 * listFiles(): возвращает массив файлов и подкаталогов, которые находятся
 * в определенном каталоге
 * mkdir(): создает новый каталог
 * renameTo(File dest): переименовывает файл или каталог
 * length(): возвращает размер файла в байтах
 * lastModified(): возвращает время последнего изменения
 * файла или каталога
 * list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
 * listFiles(): возвращает массив файлов и подкаталогов, которые
 * находятся в определенном каталоге
 * mkdir(): создает новый каталог
 * renameTo(File dest): переименовывает файл или каталог
  */
    }
}


