package org.example;

class Bird extends Animal {
    private double wingspan;

    public Bird(String name, String id, int age, double wingspan) {
        super(name, id, age);
        this.wingspan = wingspan;
    }

    public double getWingspan() { return wingspan; }

    @Override
    public String toString() {
        return "Bird{name='" + name + "', id='" + id + "', age=" + age + ", wingspan=" + wingspan + "}";
    }
}
