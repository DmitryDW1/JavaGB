package Seminar5.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class ExecHW2_5 {
    public static void main(String[] args) {
        List<String> personals = new ArrayList<>();
        personals.add("Иван Иванов");
        personals.add("Светлана Петрова");
        personals.add("Кристина Белова");
        personals.add("Анна Мусина");
        personals.add("Анна Крутова");
        personals.add("Иван Юрин");
        personals.add("Петр Лыков");
        personals.add("Павел Чернов");
        personals.add("Петр Чернышов");
        personals.add("Мария Федорова");
        personals.add("Марина Светлова");
        personals.add("Мария Савина");
        personals.add("Мария Рыкова");
        personals.add("Марина Лугова");
        personals.add("Анна Владимирова");
        personals.add("Иван Мечников");
        personals.add("Петр Петин");
        personals.add("Иван Ежов");
        showEntryList(personals);
    }

    /**
     * @apiNote Дан список сотрудников. Написать программу, которая найдёт и выведет
     * повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
     * @param personals список
     * @return отсортированный список с именами по убыванию популярности
     */
    public static Map<String, Integer> showEntryList(List<String> personals) {

        Map<String, Integer> map = new HashMap();
        for (String personal : personals) {
            String personalName = personal.split(" ")[0];
            map.put(personalName, map.getOrDefault(personalName, 0) + 1);
        }
        Map<String, Integer> sortedMap = sortedMap(map);
        for (Map.Entry entry: sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " повторения(-ий, -е)");
        }
        return map;
    }
    private static Map<String, Integer> sortedMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }
}
