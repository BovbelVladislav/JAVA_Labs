package org.example;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public void work() {
        System.out.println(name + " выполняет общие обязанности сотрудника.");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + " | Зарплата: " + salary + " | Стаж: " + experience + " лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
