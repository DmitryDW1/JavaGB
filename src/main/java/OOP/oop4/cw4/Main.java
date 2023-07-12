package OOP.oop4.cw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Написать Generic-class LRUCache, с методами : addElement, getElement(по
    //позиции), getAllElement . Посмотреть как поведет себя с классом
    //Employee(fio,salary,jobTitle)
    //Логика кэша такая:
    // в конструктор при создании подается количество кэшируемых
    //элементов
    // При переполнении крайний левый элемент кэша(самый старый)
    //удаляется
    // В самый правый конец добавляется новый элемент
    public static void main(String[] args) {
        LRUCache<Employee> lruCache = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            employees.add(new Employee("Иванов Иван Иванович " + i, i*100, "раб " + i));
        }
        for (Employee employee : employees) {
            lruCache.addElement(employee);
            System.out.println("lruCache.getAllElement() = " + lruCache.getAllElement());
        }

    }
}
