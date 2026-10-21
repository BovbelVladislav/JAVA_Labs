//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите размерность  массива (N): ");
    int n1 = scanner.nextInt();

    int[] array1 = new int[n1];

    System.out.println("Введите элементы массива (через пробел или Enter):");
    for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
    }
    int totalSum = 0;
    for (int i = 0; i < array1.length; i++) {
        totalSum += array1[i];
    }
    System.out.print("Введите размерность квадратного массива (N): ");
    int n = scanner.nextInt();

    int[][] array = new int[n][n];

    System.out.println("Введите элементы массива (через пробел или Enter):");
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            array[i][j] = scanner.nextInt();
        }
    }

    int secondaryDiagonalSum = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {

        }
        secondaryDiagonalSum += array[i][n - 1 + i];
    }

    System.out.println("\nРезультаты:");
    System.out.println("Сумма всех элементов массива: " + totalSum);
    System.out.println("Сумма элементов побочной диагонали: " + secondaryDiagonalSum);

    scanner.close();
}

