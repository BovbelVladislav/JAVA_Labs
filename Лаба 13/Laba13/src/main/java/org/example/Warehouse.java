package org.example;
import java.util.ArrayList;
import java.util.List;
class Warehouse {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new ProductNotFoundException("Товар с именем '" + name + "' не найден на складе.");
    }

    public void printWarehouse() {
        System.out.println("\n--- Текущее состояние склада ---");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
