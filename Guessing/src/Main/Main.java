package Main;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the guessing game :D, First tell me your name:");
        String name = input.next();

        System.out.println("Alright now the range, from 1 to what?");
        int range = 0;

        while (true) {
            if (input.hasNextInt()) {
                range = input.nextInt();
                if (range < 2) {
                    System.out.println("Please enter a number greater than 1:");
                } else if (range > 10000) {
                    System.out.println("What? Hell no, make it smaller:");
                } else {
                    break;
                }
            } else {
                System.out.println("That's not a valid number, try again:");
                input.next();
            }
        }
        
        int theAmazingNumber = rand.nextInt(range) + 1;
        System.out.println("PERFECT, now guess:");

        int numGuesses = 0;
        while (true) {
            if (input.hasNextInt()) {
                int guess = input.nextInt();
                numGuesses++;
                if (guess == theAmazingNumber) {
                    System.out.println("Congrats " + name + ", you guessed in " + numGuesses + " tries!");
                    break;
                } else {
                    System.out.println("Nope, try again:");
                }
            } else {
                System.out.println("That's not a valid number, try again:");
                input.next();
            }
        }

        input.close();
    }
}

