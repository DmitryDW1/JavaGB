package OOP.oop1.HomeWork.Basket;

import OOP.oop1.HomeWork.Product.Product;

import java.util.ArrayList;

public class Basket {
    public ArrayList <Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
