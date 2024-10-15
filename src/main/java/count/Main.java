package count;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете изречение: ");
        String inputText = scanner.nextLine();

        // Премахване на излишни интервали от началото и края (ако има)
        inputText = inputText.trim();

        // Проверка дали текстът не е празен след премахване на интервалите
        if (inputText.isEmpty()) {
            System.out.println("Няма думи при въвеждането.");
        } else {
            // Разделяне на думите по space
            String[] words = inputText.split("\\s+");

            System.out.println("Броят на думите е: " + words.length);
        }

    }
}
