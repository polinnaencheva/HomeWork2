package data.types;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първа дума: ");
        String firstString = scanner.nextLine();
        System.out.print("Въведете втора дума: ");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("Думите са еднакви.");
        } else {
            System.out.println("Думите не са еднакви.");


        }
    }

}