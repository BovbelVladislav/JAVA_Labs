package org.example;

public class Person {
    private String name;
    private Gender gender;

    // Конструктор
    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // Метод для вывода информации
    public void printInfo() {
        System.out.println(this); // Вызывает toString() автоматически
    }

    @Override
    public String toString() {
        String genderRu = (gender == Gender.MALE) ? "Мужчина" : "Женщина";
        return "Имя: " + name + ", Пол: " + genderRu + " (" + gender + ")";
    }
}
