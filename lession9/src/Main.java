import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию, имя и отчество:");
        String fio = scanner.nextLine();

        String[] parts = fio.trim().split("\\s+");

        if (parts.length != 3) {
            System.out.println("Введите фамилию, имя и отчество!");
            return;
        }

        String surname = parts[0].toUpperCase();
        String name = parts[1];
        String patronymic = parts[2];

        String initials = name.substring(0,1).toUpperCase(Locale.ROOT) + "."
        + patronymic.substring(0,1).toUpperCase(Locale.ROOT);

        System.out.println("фио: " + surname + " " + initials);
        System.out.println("Длинна фамилии: " + surname.length());


    }
}
