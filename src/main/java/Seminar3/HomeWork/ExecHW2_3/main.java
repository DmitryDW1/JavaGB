package Seminar3.HomeWork.ExecHW2_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Product product1 = new Product("Сок яблочный", "Грузия", 98.46, 1);
        Product product2 = new Product("Молоко Высший берег","США", 105.2, 1);
        Product product3 = new Product("Мука высший помол","Иран", 78, 1);
        Product product4 = new Product("Томаты","Узбекистан", 180.3, 2);
        Product product5 = new Product("Пельмени высший сорт","Россия", 120.76, 3);
        Product product6 = new Product("Хлеб","Польша", 48.2, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        String titleProduct = "";
        double minPrice = product1.getPrice() +
                        product2.getPrice() +
                        product3.getPrice() +
                        product4.getPrice() +
                        product5.getPrice() +
                        product6.getPrice();
        System.out.println("Введите нужный сорт товара (1, 2 или 3): ");
        Scanner scanner = new Scanner(System.in);
        int productSort = searchSort(scanner);
        System.out.println("Наименьшая цена товара с заданным сортом: " +
                getPrice(productList, productSort, minPrice, titleProduct));
    }

    /**
     * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * @param scanner
     * @return наименование товара
     */
    private static int searchSort(Scanner scanner) {
        int productSort = 0;
        boolean flag = true;
        while (flag) {
            try {
                productSort = Integer.parseInt(scanner.nextLine());
                if (productSort > 0 && productSort < 4) {
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Это не число 1, 2, 3. Попробуйте еще раз.");
            }
        }
        return productSort;
    }
    private static String getPrice(List<Product> productList, int productSort, double minPrice, String titleProduct) {
        for (Product product : productList) {
            if (Objects.equals(product.getSort(), productSort)) {
                if (product.getPrice() < minPrice) {
                    minPrice = product.getPrice();
                    titleProduct = product.getTitle() + " " +  minPrice;
                }
            }
        }
        return titleProduct;
    }
}
