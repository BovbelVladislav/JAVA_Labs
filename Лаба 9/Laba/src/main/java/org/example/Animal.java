package org.example;
abstract class Animal {
    protected String name;
    protected int age;
    protected double weight; // вес в кг

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();
    public abstract void move();

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг");
    }
}