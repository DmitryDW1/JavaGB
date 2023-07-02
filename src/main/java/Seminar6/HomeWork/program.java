package Seminar6.HomeWork;


import java.util.*;

public class program {
    /**
     * @apiNote • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать
     * в java.
     * • Создать множество ноутбуков.
     * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
     * ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
     * можно также в Map.
     * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     *
     * @param args список ноутбуков
     * @throws metods
     * @return отсортированный список ноутбуков
     */
    public static void main(String[] args) throws metods{
        ArrayList<Notebook> notebooks = NotebooksList.getNotebooks();

        Map<String, Object> filterNotebook = new HashMap<>();
        metods.notebookFilterSelect(filterNotebook);
        List<Notebook> resultNotebookFilterSelect = metods.extractedNotebooks(notebooks, filterNotebook);
        if(resultNotebookFilterSelect.size() == 0){
            System.out.println("Ничего не найдено!");
        } else {
            metods.viewNotebooks((ArrayList<Notebook>) resultNotebookFilterSelect);
        }
    }
}



