package org.example;

class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Цена не может быть отрицательной или нулевой!", price);
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество товара не может быть отрицательным!");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getCategory() { return category; }

    public void reduceQuantity(int amount) throws OutOfStockException {
        if (amount < 0) {
            throw new IllegalArgumentException("Количество для уменьшения не может быть отрицательным!");
        }
        if (amount > quantity) {
            throw new OutOfStockException("Недостаточно товара на складе!", amount, quantity);
        }
        this.quantity -= amount;
    }

    // Метод увеличения цены на заданный процент
    public void increasePrice(double percent) throws InvalidPriceException {
        if (percent < 0) {
            throw new InvalidPriceException("Процент увеличения не может быть отрицательным", percent);
        }
        this.price += this.price * (percent / 100.0);
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', price=%.2f, quantity=%d, category='%s'}",
                name, price, quantity, category);
    }
}
