import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("=================================");
        System.out.println("        ОТЧЕТ ПО ЗАРПЛАТЕ        ");
        System.out.println("=================================");
        System.out.printf("%-15s%10s\n ", "ФИО", "Зарплата");
        for (Employee emp : employees) {
            System.out.printf("%-15s %10.2f%n", emp.getFullname(), emp.getSalary());
        }
        System.out.println("=================================");
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("--- ЗАДАНИЕ 1 ---");
        task1("Привет, мир!");

        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        task2("Java — замечательный язык программирования");

        System.out.println("\n--- ЗАДАНИЕ 3 ---");
        task3();

        System.out.println("\n--- ЗАДАНИЕ 4 ---");
        task4("aAXa aeffa aGha aza ax23a a3sSa");
    }

    public static void task1(String str) {
        if (str != null && !str.isEmpty()) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Исходная строка: " + str);
            System.out.println("Последний символ: " + lastChar);
        } else {
            System.out.println("Строка пустая.");
        }
    }

    public static void task2(String sentence) {
        String[] words = sentence.trim().split("[\\s\\p{Punct}]+");

        if (words.length == 0 || words[0].isEmpty()) {
            System.out.println("Предложение не содержит слов.");
            return;
        }

        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Предложение: " + sentence);
        System.out.println("Самое короткое слово: " + shortestWord);
    }

    public static void task3() {
        Employee[] employees = {
                new Employee("Иванов И.И.", 125000.50),
                new Employee("Петров П.П.", 98000.753),
                new Employee("Сидоров С.С.", 150000.0)
        };

        Report.generateReport(employees);
    }

    public static void task4(String text) {
        Pattern pattern = Pattern.compile("\\ba[a-z0-9]{1,3}a\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Исходная строка: " + text);
        System.out.println("Найденные совпадения:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}