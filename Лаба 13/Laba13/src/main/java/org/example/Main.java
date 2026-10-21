package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Warehouse warehouse = new Warehouse();

        try {
            warehouse.addProduct(new Product("Ноутбук", 75000.0, 5, "Электроника"));
            warehouse.addProduct(new Product("Мышь", 1500.0, 12, "Электроника"));
            warehouse.addProduct(new Product("Стол", 12000.0, 2, "Мебель"));
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка создания товара (неверная цена): " + e.getMessage() + " (цена: " + e.getInvalidPrice() + ")");
        }

        warehouse.printWarehouse();

        System.out.println("\n--- Операция покупки ---");
        try {
            Product laptop = warehouse.findProductByName("Ноутбук");
            laptop.reduceQuantity(2); // Покупаем 2 ноутбука
            System.out.println("Успешно куплено 2 Ноутбука. Остаток: " + laptop.getQuantity());

            laptop.reduceQuantity(10);
        } catch (ProductNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Ошибка покупки: " + e.getMessage() +
                    " [Запрошено: " + e.getRequested() + ", Доступно: " + e.getAvailable() + "]");
        }

        System.out.println("\n--- Повышение цен ---");
        try {
            Product mouse = warehouse.findProductByName("Мышь");
            mouse.increasePrice(15.0);
            System.out.println("Цена на мышь успешно увеличена: " + mouse);
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка изменения цены: " + e.getMessage());
        }

        System.out.println("\n--- Проверка некорректной цены ---");
        try {
            Product brokenProduct = new Product("Брак", -500.0, 10, "Тест");
        } catch (InvalidPriceException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage() + " Значение: " + e.getInvalidPrice());
        }

        warehouse.printWarehouse();
    }
}
