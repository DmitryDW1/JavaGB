package Seminar3.HomeWork.ExecHW1_3;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        Product product1 = new Product("Сок яблочный", 98.46, 1);
        Product product2 = new Product("Молоко Высший берег", 105.2, 1);
        Product product3 = new Product("Мука высший помол", 78, 1);
        Product product4 = new Product("Томаты", 180.3, 2);
        Product product5 = new Product("Пельмени высший сорт", 120.76, 3);
        Product product6 = new Product("Хлеб", 48.2, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        String searchTitle = "высший";
        Double maxPrice = 0.0;
        String productsSortedTitle = "";
        System.out.println("Товары 1 и 2 сорта с наибольшей ценой, содержащие в названии 'высший': ");
        System.out.println(sortedProducts(productList, searchTitle, productsSortedTitle));
        System.out.println("Наибольшая цена: " + getPrice(productList, searchTitle, maxPrice));
    }

    /**
     * @apiNote Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта
     * среди товаров, название которых содержит «высший».
     * @param productList
     * @param searchTitle
     * @param maxPrice
     * @return цена товара
     */
    private static double getPrice(List<Product> productList, String searchTitle, Double maxPrice) {
        for (Product product : productList) {
            if (product.getTitle().toLowerCase().contains(searchTitle) &&
                    (product.getSort() == 1 || product.getSort() == 2)) {
                if (maxPrice < product.getPrice()) {
                    maxPrice = product.getPrice();
                }
            }
        }
        return maxPrice;
    }
    private static String sortedProducts(List<Product> productList, String searchTitle, String productsSortedTitle) {
        for (Product product : productList) {
            if (product.getTitle().toLowerCase().contains(searchTitle) &&
                    (product.getSort() == 1 || product.getSort() == 2)) {
                productsSortedTitle += product.getTitle() + " " +  product.getPrice() + "\n";
            }
        }
        return productsSortedTitle;
    }
}
