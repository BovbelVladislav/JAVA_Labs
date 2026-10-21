package org.example;

public class Book {
    private String title;
    private String author;
    private int year;

    // Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Геттер для получения года
    public int getYear() {
        return year;
    }

    // Переопределение метода для красивого вывода книги
    @Override
    public String toString() {
        return "\"" + title + "\" (" + author + ", " + year + " год)";
    }
}
