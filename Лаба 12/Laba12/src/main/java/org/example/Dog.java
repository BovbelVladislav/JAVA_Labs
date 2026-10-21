package org.example;

class Dog extends Animal {
    private String breed;

    public Dog(String name, String id, int age, String breed) {
        super(name, id, age);
        this.breed = breed;
    }

    public String getBreed() { return breed; }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', id='" + id + "', age=" + age + ", breed='" + breed + "'}";
    }
}
