package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Animal dog1 = new Dog("Бобик", 4, 12.5, "Дворняжка");
        Dog dog = new Dog("Бобик", 4, 12.5, "Дворняжка");
        Animal dog2 = new Dog("Рекс", 5, 28.0, "Немецкая овчарка");

        // Создаем 3 птицы
        Animal bird1 = new Bird("Чижик", 1, 0.05, 0.2);
        Animal bird2 = new Bird("Кеша", 2, 0.1, 0.3);
        Animal bird3 = new Bird("Орел", 3, 4.5, 2.1);

        Animal[] animals = {dog1, dog2, bird1, bird2, bird3};

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
        }
    }
}
