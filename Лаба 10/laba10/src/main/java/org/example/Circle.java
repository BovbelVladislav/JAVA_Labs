package org.example;

class Circle implements Drawable, Calculatable, Comparable {
    private String color;
    private double radius;
    private int x, y;

    public Circle(String color, double radius, int x, int y) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг цвета " + color + " с радиусом " + radius + " в точке (" + x + ", " + y + ")");
    }

    @Override
    public String choto() {
        return color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            Circle other = (Circle) o;
            return Double.compare(this.calculateArea(), other.calculateArea());
        }
        return 0;
    }
}
