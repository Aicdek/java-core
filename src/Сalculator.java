import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введие первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("введие второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /): ");
        char operetion = scanner.next().charAt(0);

        if (operetion == '+'){
            System.out.println("Результат: " + (num1 + num2));
        }else if (operetion == '-') {
            System.out.println("Результат: " + (num1 - num2));
        }else if (operetion == '*') {
            System.out.println("Результат: " + (num1 * num2));
        }else if (operetion == '/') {
            if (num2 == 0){
                System.out.println("ошибка: деление на ноль");
            }else {
                System.out.println("Результат: " + (num1 / num2));
            }
        } else {
            System.out.println("Ошибка: неизвестная операция.");
        }



    }
}
