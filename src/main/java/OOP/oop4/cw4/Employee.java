package OOP.oop4.cw4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Open Closed Principle (Принцип открытости/закрытости)
 * открыт для расширений, закрыт для изменений
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    String fio;
    double salary;
    String jobTitle;
}
