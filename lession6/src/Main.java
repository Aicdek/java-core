import java.util.Scanner;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Введите число:");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;

        }
        System.out.println("количество:" + count);
        System.out.println("сумма:" + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("среднее число:" + average);
        }else {
            System.out.println("невозможно вычеслить");
        }
    }
}