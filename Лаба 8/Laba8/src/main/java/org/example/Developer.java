package org.example;

public class Developer extends Employee {

    private String language;

    public Developer(String name, double salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на " + language + ".");
    }

    public void debugCode() {
        System.out.println(getName() + " ищет и исправляет баги в коде на " + language + ".");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
