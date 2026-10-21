package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student s1 = new Student("Алексей", 2, "ИВТ-21");
        Student s2 = new Student("Мария", 1, "ИВТ-22");
        Student s3 = new Student("Иван", 3, "ИВТ-31");
        Student s4 = new Student("Елена", 2, "ИВТ-21");
        Student s5 = new Student("Дмитрий", 4, "ИВТ-41");
        Student s6 = new Student("Ольга", 1, "ИВТ-22");

        // Демонстрация работы сеттера: допустим, Алексей перевелся на 3 курс
        s1.setCourse(3);

        // Выводим результаты через статические геттеры
        System.out.println("Всего студентов: " + Student.getTotalStudents());
        System.out.println("Сумма курсов: " + Student.getTotalCourses());
        System.out.println("Средний курс: " + Student.getAverageCourse());

        // Проверим имя первого студента через геттер
        System.out.println("Студент 1: " + s1.getName() + ", курс: " + s1.getCourse());}
}
