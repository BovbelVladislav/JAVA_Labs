package org.example;

public class Ticket {
    // Инкапсулированные поля класса
    private String event;
    private int seatNumber;
    private double price;

    // Конструктор для инициализации билета
    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Геттеры для получения информации о поле
    public String getEvent() {
        return event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    // Метод для применения скидки (принимает процент скидки, например, 15.0 для 15%)
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountAmount = price * (percent / 100.0);
            price -= discountAmount;
            System.out.println("Скидка " + percent + "% успешно применена!");
        } else {
            System.out.println("Ошибка: процент скидки должен быть от 0 до 100!");
        }
    }
}
