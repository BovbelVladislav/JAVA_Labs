package org.example;

class Animal {
    protected String name;
    protected String id;
    protected int age;

    public Animal(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', id='" + id + "', age=" + age + "}";
    }
}
