
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



                String originalText = "My name is <Test>";
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your name: ");
                String userInput = scanner.nextLine();


                String modifiedText = originalText.replace("<Test>", userInput);


                System.out.println(modifiedText);

            }
        }


