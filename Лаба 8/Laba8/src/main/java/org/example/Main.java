package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Алексей", 2500.0, 5, 8);
        employees[1] = new Developer("Владислав", 3000.0, 3, "Java");
        employees[2] = new Manager("Екатерина", 2800.0, 6, 12);
        employees[3] = new Developer("Дмитрий", 2200.0, 2, "C#");
        employees[4] = new Manager("Игорь", 3500.0, 8, 15);

        for (Employee emp : employees) {
            emp.displayInfo();
            emp.work();

            if (emp instanceof Manager) {
                ((Manager) emp).holdMeeting();
            } else if (emp instanceof Developer) {
                ((Developer) emp).debugCode();
            }

            System.out.println("----------------------------------------");
        }
    }
}
