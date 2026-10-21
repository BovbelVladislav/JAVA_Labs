package org.example;

class Rectangle implements Drawable, Calculatable, Comparable {
    private String color;
    private double width;
    private double height;
    private int x, y;

    public Rectangle(String color, double width, double height, int x, int y) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник цвета " + color + " со сторонами " + width + "x" + height + " в точке (" + x + ", " + y + ")");
    }

    @Override
    public String choto() {
        return color;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Rectangle) {
            Rectangle other = (Rectangle) o;
            return Double.compare(this.calculateArea(), other.calculateArea());
        }
        return 0;
    }
}
