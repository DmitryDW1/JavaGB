package OOP.oop1.HomeWork;

import OOP.oop1.HomeWork.Category.Category;
import OOP.oop1.HomeWork.Product.Product;
import OOP.oop1.HomeWork.Shop.Shop;
import OOP.oop1.HomeWork.User.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category categoryFood = new Category("Food");
        Category categorySport = new Category("Sport");
        Category categoryClothes = new Category("Clothes");
        User userD = new User("Dima", "12345");
        User userP = new User("Petya", "67890");
        User userK = new User("Kolya", "13579");
        Product apple = new Product("Семеринка", 99.0, 1);
        categoryFood.products.add(apple);
        Product ball = new Product("Футбол", 670.40, 2);
        categorySport.products.add(ball);
        Product boots = new Product("Болотники", 947.26, 4);
        categoryClothes.products.add(boots);
        shop.addCategory(categoryFood);
        shop.addCategory(categorySport);
        shop.addCategory(categoryClothes);
        shop.printCategoryProducts();
        System.out.println("-----------");
        userD.getBasket().addProduct((Product) categoryFood.getProducts().get(0));
        userP.getBasket().addProduct((Product) categoryClothes.getProducts().get(0));
        userK.getBasket().addProduct((Product) categorySport.getProducts().get(0));
        categoryFood.getProducts().remove(0);
        categoryClothes.getProducts().remove(0);
        categorySport.getProducts().remove(0);
        shop.printCategoryProducts();
        System.out.println("------------");
        System.out.println("Покупки " + userD.getLogin() + ": ");
        ArrayList<Product> productsUserD = userD.getBasket().products;
        for (Product product: productsUserD){
            System.out.println("- " + product.getName() + " " + product.getPrice() + " " + product.getRating());
        }
        System.out.println("Покупки " + userP.getLogin() + ": ");
        ArrayList<Product> productsUserP = userP.getBasket().products;
        for (Product product: productsUserP){
            System.out.println("- " + product.getName() + " " + product.getPrice() + " " + product.getRating());
        }
        System.out.println("Покупки " + userK.getLogin() + ": ");
        ArrayList<Product> productsUserK = userK.getBasket().products;
        for (Product product: productsUserK){
            System.out.println("- " + product.getName() + " " + product.getPrice() + " " + product.getRating());
        }
    }
}
