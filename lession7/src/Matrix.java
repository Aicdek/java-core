import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];

            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Сумма главной диагонали: " + sum);
        System.out.println("Сумма побочной диагонали: " + secondarySum);
    }
}
