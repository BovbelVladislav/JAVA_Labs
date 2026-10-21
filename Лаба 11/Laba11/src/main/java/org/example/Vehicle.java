package org.example;

class Vehicle {
    protected String brand;
    protected int year;
    protected double speed;


    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }


    public void move() {
        System.out.println(brand + ": Транспорт движется");
    }

    public void move(int distance) {
        System.out.println(brand + ": Транспорт проехал " + distance + " км");
    }

    public void move(String destination) {
        System.out.println(brand + ": Транспорт едет в " + destination);
    }


    public double getSpeed() {
        return speed;
    }
}
