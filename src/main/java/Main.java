/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // takes input from the keyboard
        int number = input.nextInt();
       int sum = 0;
       for ( int i = 1; i <= number; i++) {
           sum += i;
       }
       System.out.print(sum);

    }
    }


