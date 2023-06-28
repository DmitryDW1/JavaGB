package Seminar6;

public class task4 {
    public static void main(String[] args) {
        double temp = 1.0;
        convZadanie(temp);
    }

    /**
     * @apiNote Напишите интерфейс Converter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
     * для валидного перевода величин. Метод для конвертации назовите "convertValue".
     * @param temp температура по Цельсию
     */
    private static void convZadanie(double temp) {
        System.out.println("temp Cel= " + new Cels().convertValue(temp));
        System.out.println("temp Kel= " + new Kelvin().convertValue(temp));
        System.out.println("temp Far= " + new Faren().convertValue(temp));
    }
}
