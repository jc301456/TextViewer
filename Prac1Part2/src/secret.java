import java.util.Random;
import java.util.Scanner;

/**My Guess Program
 * Created by jc301456 on 2/03/15.
 */
public class secret {
    public static void main(String[] args){
        Random random = new Random();
        int secret = random.nextInt(100);
        System.out.print(secret);
        System.out.println("Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess == secret){
            System.out.println("You win!");
        }else{
            System.out.println("You lose...");
        }
    }
}
