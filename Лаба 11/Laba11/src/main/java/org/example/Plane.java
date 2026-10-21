package org.example;

class Plane extends Vehicle {
    private double maxAltitude;

    public Plane(String brand, int year, double speed, double maxAltitude) {
        super(brand, year, speed);
        this.maxAltitude = maxAltitude;
    }


    @Override
    public double getSpeed() {
        return speed * 2.0;
    }


    @Override
    public void move() {
        System.out.println("Самолет " + brand + " летит в небе на высоте " + maxAltitude + " м со скоростью " + getSpeed() + " км/ч.");
    }
}
