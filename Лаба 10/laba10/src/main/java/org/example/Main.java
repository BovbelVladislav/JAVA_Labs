package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculatable circle1 = new Circle("Красный", 5.0, 0, 0);
        Calculatable circle2 = new Circle("Синий", 3.2, 1, 2);
        Calculatable circle3 = new Circle("Зеленый", 7.5, -3, 4);

        Calculatable rect1 = new Rectangle("Желтый", 4.0, 6.0, 2, 2);
        Calculatable rect2 = new Rectangle("Оранжевый", 5.0, 5.0, -1, -1);

        Drawable[] drawables = {
                (Drawable) circle1, (Drawable) circle2, (Drawable) circle3,
                (Drawable) rect1, (Drawable) rect2
        };

        Calculatable[] figures = {circle1, circle2, circle3, rect1, rect2};

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Фигура №" + (i + 1) + ":");
            drawables[i].draw();
            System.out.printf("  Площадь: %.2f\n", figures[i].calculateArea());
            System.out.printf("  Периметр: %.2f\n", figures[i].calculatePerimeter());
        }
    }
}
