package OOP.oop1.HomeWork.Category;

import OOP.oop1.HomeWork.Product.Product;

import java.util.ArrayList;

public class Category {
    private String name;
    public ArrayList<Product> products;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getProducts() {
        return products;
    }

    public void setProducts(ArrayList products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category " +
                "name='" + name + '\'' +
                ", products=" + products;
    }
}
