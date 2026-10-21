/**
 * Вычисляет сумму двух чисел.
 * @param a первое число
 * @param b второе число
 * @return сумма чисел
 */
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите программу (1-3):");
    System.out.println("1 - Найти сумму двух чисел");
    System.out.println("2 - Найти модуль суммы двух чисел");
    System.out.println("3 - Вывести четные числа от 2 до 100");

    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Введите первое число:");
            int a1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b1 = scanner.nextInt();
            System.out.println("Сумма: " + (a1 + b1));
            break;

        case 2:
            System.out.println("Введите первое число:");
            int a2 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b2 = scanner.nextInt();
            if ((a2+b2)>=0){

                System.out.println("Модуль суммы этих чисел: "+ (a2+b2));

            }

            else {

                System.out.println("Модуль суммы этих чисел: "+ ((a2+b2)*(-1)));

            }
            break;

        case 3:
            System.out.println("Четные числа от 2 до 100:");
//            for (int d = 2; d <= 100; d += 2) {
//                System.out.println(d);
//            }
            int a=0;
            do {
                a+=2;
                System.out.println(a);
            }
            while (a<100);
            break;

        default:
            System.out.println("Ошибка: выбран несуществующий пункт меню.");
            break;
    }

    scanner.close();

}
