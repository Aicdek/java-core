import java.util.Random;
import java.util.Scanner;

public class random {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int option;
        int attempts = 0;

        do {
            System.out.println("угадайте число от 1 до 100");
            option = scanner.nextInt();

            attempts++;

            if (option < number){
                System.out.println("Больше!");
            }else if (option > number){
                System.out.println("Меньше!");
            }else {
                System.out.println("Вы угадали");
            }
        }while (option != number);
        System.out.println("Количество попыток: " + attempts);
    }
}
