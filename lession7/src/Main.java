import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) +1;
        }
        int min = numbers[0];
        int max = numbers[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Массив: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nМинимум: " + min);
        System.out.println("Индекс минимума: " + minIndex);

        System.out.println("Максимум: " + max);
        System.out.println("Индекс максимума: " + maxIndex);

    }
}