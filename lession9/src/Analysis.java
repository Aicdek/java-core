import java.util.Scanner;

public class Analysis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

        if (sentence.trim().isEmpty()) {
            System.out.println("Предложение не должно быть пустым!");
            return;
        }

        int wordCount = words.length;
        int charCount = 0;
        int vowelCount = 0;

        String longestWord = words[0];
        String shortestWord = words[0];

        String vowels = "аеёиоуыэюя";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            charCount += word.length();


            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

            for (int j = 0; j < word.length(); j++) {
                char letter = Character.toLowerCase(word.charAt(j));

                if (vowels.indexOf(letter) != -1) {
                    vowelCount++;
                }
            }
        }

        System.out.println("Количество слов: " + wordCount);
        System.out.println("Количество символов без пробелов: " + charCount);
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Самое длинное слово: " + longestWord);
        System.out.println("Самое короткое слово: " + shortestWord);


        }
}
