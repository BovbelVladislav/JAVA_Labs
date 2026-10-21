package org.example;

class Cat extends Animal {
    private String color;

    public Cat(String name, String id, int age, String color) {
        super(name, id, age);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', id='" + id + "', age=" + age + ", color='" + color + "'}";
    }
}
