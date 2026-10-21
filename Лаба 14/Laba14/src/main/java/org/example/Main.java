package org.example;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String fileName = "specialty_info.txt";

        // 1. Создаем файл и записываем информацию о специальности
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Специальность: Программное обеспечение информационных технологий\n");
            writer.write("Квалификация: Техник-программист\n");
            writer.write("Срок обучения: 3 года 10 месяцев\n");
            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании/записи файла: " + e.getMessage());
        }

        // 2. Выводим данные (свойства) о файле с использованием java.io.File и java.nio.file
        File fileObj = new File(fileName);
        System.out.println("\n--- Свойства файла ---");
        System.out.println("Имя файла: " + fileObj.getName());
        System.out.println("Абсолютный путь: " + fileObj.getAbsolutePath());
        System.out.println("Размер файла: " + fileObj.length() + " байт");
        System.out.println("Файл существует: " + fileObj.exists());
        System.out.println("Доступен для чтения: " + fileObj.canRead());

        // 3. Выводим содержимое файла на экран
        System.out.println("\n--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }





        String fileName1 = "f.txt";
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод 10 целых чисел с клавиатуры и запись в файл
        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName1))) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Ошибка! Введите целое число: ");
                    scanner.next();
                }
                int num = scanner.nextInt();
                writer.println(num);
            }
            System.out.println("Числа успешно записаны в файл '" + fileName1 + "'.\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        // 2. Чтение из файла, вывод на экран и нахождение суммы
        System.out.println("--- Чтение чисел из файла и расчет суммы ---");
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            System.out.print("Прочитанные числа: ");
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println("\nСумма всех чисел: " + sum);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата данных в файле: " + e.getMessage());
        }






        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";
        Random random = new Random();

        // 1. Создаем файл 'f' со случайными целыми числами (например, 20 штук от 1 до 100)
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 20; i++) {
                int randNum = random.nextInt(100) + 1; // от 1 до 100
                writer.println(randNum);
            }
            System.out.println("Файл '" + fileF + "' заполнен случайными числами.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла f: " + e.getMessage());
        }

        // 2. Читаем из 'f' и распределяем по файлам 'g' и 'h'
        try (BufferedReader reader = new BufferedReader(new FileReader(fileF));
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num > 50) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Распределение завершено успешно!");
            System.out.println("Числа > 50 записаны в '" + fileG + "'.");
            System.out.println("Числа <= 50 записаны в '" + fileH + "'.");

        } catch (IOException e) {
            System.out.println("Ошибка обработки файлов: " + e.getMessage());
        }





        String fileName2 = "wind_speeds.txt";
        Scanner scanner1 = new Scanner(System.in);

        // 1. Ввод 10 вещественных значений скорости ветра с клавиатуры
        System.out.println("Введите 10 вещественных значений скорости ветра:");
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName2))) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Скорость " + (i + 1) + ": ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Ошибка! Введите вещественное число: ");
                    scanner.next();
                }
                double speed = scanner1.nextDouble();
                writer.println(speed);
            }
            System.out.println("Данные успешно сохранены в файл.\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }

        // 2. Считывание данных и вычисление средней скорости
        double sum1 = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            System.out.print("Считанные значения скорости: ");
            while ((line = reader.readLine()) != null) {
                double speed = Double.parseDouble(line);
                System.out.print(speed + " ");
                sum1 += speed;
                count++;
            }

            if (count > 0) {
                double average = sum1 / count;
                System.out.printf("\nСредняя скорость ветра: %.2f\n", average);
            } else {
                System.out.println("\nФайл пуст.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }







        String fileName3 = "f.txt";
        Random random2 = new Random();

        // 1. Создаем файл 'f' с 10 целыми числами (включая нули для теста)
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName3))) {
            for (int i = 0; i < 10; i++) {
                // Генерируем числа от -5 до 5, чтобы чаще попадались нули
                int num = random2.nextInt(11) - 5;
                writer.println(num);
            }
            System.out.println("Файл '" + fileName3 + "' создан.");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
        }

        // 2. Считываем данные и считаем количество нулей
        int zeroCount = 0;
        System.out.print("Содержимое файла: ");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName3))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.print(num + " ");
                if (num == 0) {
                    zeroCount++;
                }
            }
            System.out.println("\nКоличество чисел, равных нулю: " + zeroCount);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
