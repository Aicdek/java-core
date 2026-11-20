import java.util.Scanner;

public class Name{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите ваше имя:");
        String name = scanner.nextLine();

        System.out.print("введите ваш год рождения:");
        int year = scanner.nextInt();

        int age = 2026 - year;

        System.out.println("привет, " + name);
        System.out.print("ваш возраст: " + age );
    }
}