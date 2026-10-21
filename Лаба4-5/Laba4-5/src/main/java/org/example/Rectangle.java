package org.example;

class Rectangle {
    private double width;
    private double height;

    // Конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления площади
    public double area() {
        return width * height;
    }

    // Метод для вычисления периметра
    public double perimeter() {
        return 2 * (width + height);
    }
}
