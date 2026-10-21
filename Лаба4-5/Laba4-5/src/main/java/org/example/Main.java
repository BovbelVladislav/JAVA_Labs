package org.example;

public class Main {
    static void main() {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(3.5, 2.0);

        System.out.println("Прямоугольник 1:");
        System.out.println("Площадь: " + rect1.area());
        System.out.println("Периметр: " + rect1.perimeter());

        System.out.println("\nПрямоугольник 2:");
        System.out.println("Площадь: " + rect2.area());
        System.out.println("Периметр: " + rect2.perimeter());
        Book[] books = new Book[5];
        books[0] = new Book("Война и мир", "Л.Н. Толстой", 1869);
        books[1] = new Book("Преступление и наказание", "Ф.М. Достоевский", 1866);
        books[2] = new Book("Мастер и Маргарита", "М.А. Булгаков", 1967);
        books[3] = new Book("Капитанская дочка", "А.С. Пушкин", 1836);
        books[4] = new Book("Гарри Поттер и философский камень", "Дж.К. Роулинг", 1997);

        Book oldestBook = books[0];
        Book newestBook = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
            if (books[i].getYear() > newestBook.getYear()) {
                newestBook = books[i];
            }
        }

        System.out.println("Самая старая книга: " + oldestBook);
        System.out.println("Самая новая книга: " + newestBook);
        Person man = new Person("Алексей", Gender.MALE);
        Person woman = new Person("Елена", Gender.FEMALE);

        // Вывод информации
        man.printInfo();
        woman.printInfo();
        System.out.println(man);
    }
    }


