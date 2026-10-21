package org.example;

class Car extends Vehicle {
    private int doorsCount;

    public Car(String brand, int year, double speed, int doorsCount) {
        super(brand, year, speed);
        this.doorsCount = doorsCount;
    }


    @Override
    public double getSpeed() {
        return speed * 1.0;
    }


    @Override
    public void move() {
        System.out.println("Автомобиль " + brand + " едет по дороге со скоростью " + getSpeed() + " км/ч.");
    }
}
