package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
// Создаем билет на концерт
        Ticket myTicket = new Ticket("Рок-концерт", 15, 3500.0);

        // Выводим информацию о билете до скидки
        System.out.println("--- Информация до скидки ---");
        System.out.println("Мероприятие: " + myTicket.getEvent());
        System.out.println("Номер места: " + myTicket.getSeatNumber());
        System.out.println("Цена: " + myTicket.getPrice() + " руб.\n");

        // Применяем скидку 20%
        myTicket.applyDiscount(20.0);

        // Выводим цену после применения скидки
        System.out.println("\n--- Информация после скидки ---");
        System.out.println("Новая цена билета: " + myTicket.getPrice() + " руб.");
    }
}
