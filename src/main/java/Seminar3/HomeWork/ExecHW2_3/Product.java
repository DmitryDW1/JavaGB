package Seminar3.HomeWork.ExecHW2_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String title;
    private String country;
    private double price;
    private int sort;

}