package org.example;
class Dog extends Animal {
    private String breed; // порода

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + breed + "): Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(name + " бегает на четырёх лапах.");
    }
}