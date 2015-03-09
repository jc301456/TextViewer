import java.util.Random;
import java.util.Scanner;

/**
 * Created by jc301456 on 2/03/15.
 */
public class GuessingGame {
    public static void main(String[] args){
        Random random = new Random();

        System.out.println("Input minimum integer: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();


        System.out.println("Input maximum integer: ");
        scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        int secret = random.nextInt(100);
        System.out.println(secret);

        System.out.println("Guess the number: ");
        scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == secret){
            System.out.println("You win!");
        }else{
            System.out.println("You loose...");
        }

    }
}
