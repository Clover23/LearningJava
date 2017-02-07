/**
 * Created by Kateryna Shlapatska on 10.11.2016.
 * This program defines if the number is odd or even.
 */
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        System.out.println ("Please, provide an integer");
        Scanner in = new Scanner (System.in);
        int n = 0;
        while (in.hasNextInt ()) {
            n = in.nextInt ();

            if (n % 2 == 0) {
                System.out.println (n + " is even");
            } else {
                System.out.println (n + " is odd");
            }
        }


        System.out.println (n);
    }
}










