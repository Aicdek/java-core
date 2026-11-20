import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите оценку");
        int score = Integer.parseInt(scanner.nextLine());


        String s;
        if (score > 100) {
            s = " ошибка";
        }else if (score >= 90) {
            s = " Отлично";
        } else if (score >= 75) {
            s = " Хорошо";
        } else if (score >= 60) {
            s = " пойдёт";
        } else {
            s = " пересдача";
        }

        System.out.println(s);
    }
}
