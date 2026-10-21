package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printProducts(List<Product> products, int rating) {
        System.out.println("\n--- Печать товаров с рейтингом >= " + rating + " ---");
        for (Product p : products) {
            if (p.getAverageRating() >= rating) {
                System.out.println(p);
            }
        }
    }
    static void main() {
        Map<String, Animal> animalsMap = new HashMap<>();

        animalsMap.put("Рекс", new Dog("Рекс", "D1", 3, "Немецкая овчарка"));
        animalsMap.put("Бобик", new Dog("Бобик", "D2", 5, "Бульдог"));
        animalsMap.put("Шарик", new Dog("Шарик", "D3", 2, "Пудель"));

        animalsMap.put("Барсик", new Cat("Барсик", "C1", 2, "Черный"));
        animalsMap.put("Мурка", new Cat("Мурка", "C2", 4, "Белый"));
        animalsMap.put("Рыжик", new Cat("Рыжик", "C3", 1, "Рыжий"));

        animalsMap.put("Кеша", new Bird("Кеша", "B1", 1, 0.25));
        animalsMap.put("Чижик", new Bird("Чижик", "B2", 2, 0.15));

        System.out.println("=== Все животные в Map ===");
        for (Map.Entry<String, Animal> entry : animalsMap.entrySet()) {
            System.out.println("Ключ (Имя): " + entry.getKey() + " | Значение: " + entry.getValue());
        }




        List<Product> products = new ArrayList<>();
        products.add(new Product("P1", "Ноутбук", "Электроника", 4.5, Arrays.asList(5, 4, 5, 4)));
        products.add(new Product("P2", "Тетрадь", "Канцтовары", 2.5, Arrays.asList(2, 3, 2, 1)));
        products.add(new Product("P3", "Ручка", "Канцтовары", 4.2, Arrays.asList(4, 5, 4)));
        products.add(new Product("P4", "Стол", "Мебель", 1.8, Arrays.asList(1, 2, 2)));
        products.add(new Product("P5", "Стул", "Мебель", 4.0, Arrays.asList(4, 4, 4, 4)));

        System.out.println("Исходный список товаров:");
        products.forEach(System.out::println);

        products.removeIf(p -> p.getAverageRating() < 3.0);

        for (Product p : products) {
            if (p.getAverageRating() >= 4.0) {
                p.setRating(Math.min(5.0, p.getRating() + 0.3));
            }
        }

        printProducts(products, 4);

        products.sort((p1, p2) -> {
            int cmp = Double.compare(p2.getAverageRating(), p1.getAverageRating());
            if (cmp != 0) {
                return cmp;
            }
            return p1.getName().compareTo(p2.getName());
        });

        // Вывод ID, названия и среднего рейтинга
        System.out.println("\n--- Итоговые отсортированные товары ---");
        System.out.printf("%-5s | %-15s | %-15s%n", "ID", "Название", "Средний рейтинг");
        System.out.println("----------------------------------------");
        for (Product p : products) {
            System.out.printf("%-5s | %-15s | %-15.2f%n", p.getId(), p.getName(), p.getAverageRating());
        }
    }
    }

