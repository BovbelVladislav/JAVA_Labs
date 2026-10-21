package org.example;

class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double weight, double wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (размах крыльев " + wingSpan + " м): Чирик-чирик!");
    }

    @Override
    public void move() {
        System.out.println(name + " летает в небе.");
    }
}
