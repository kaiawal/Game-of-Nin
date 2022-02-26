package nim;

import java.util.Scanner;
import java.lang.Math;
import package1.package2.Methods;

public class Methods {
    static int turnOne(String player1, String player2) {
        // random number 10-50 + defining scanner
        int total = (int) (Math.random() * 41) + 10;
        Scanner turns = new Scanner(System.in);
        while (total != 0) {
            // prints total + user input (int)
            System.out.println("Pot total: " + total);
            System.out.println(player1 + ", how many do you want to take? ");
            int num = turns.nextInt();

            // checks if guess is larger than half
            int max = total / 2;
            // failsafe (because (int) 1/2 = 0, which won't let anyone win)
            if (total == 1) {
            } else if (num > max) {
                System.out.println(
                        "You can't take away more than half! Max you can take is: " + max + "\n. Enter a new number: ");
                num = turns.nextInt();
            }
            // generates new total
            total = total - num;
            // finding out if they win
            if (total == 0) {
                System.out.println(player2 + " wins!");
                // returning and closing method, player 2 wins
                return 2;
            }

            // player 2 turn
            System.out.println("New total is " + total);
            System.out.println(player2 + ", how many do you want to take? ");
            num = turns.nextInt();
            // checks if guess is larger than half
            max = total / 2;
            // failsafe (because (int) 1/2 = 0, which won't let anyone win)
            if (total == 1) {
            }
            // makes sure you can't take out more than half
            else if (num > max) {
                System.out.println(
                        "You can't take away more than half! Max you can take is: " + max + "Enter a new number: ");
                num = turns.nextInt();
            }
            total = total - num;
            // player 1 wins
            if (total == 0) {
                System.out.println(player1 + " wins!");
                return 1;
            }
        }
        return 0;

    }

    static int turnTwo(String player1, String player2) {
        // random number 10-50 + defining scanner
        int total = (int) (Math.random() * 41) + 10;
        Scanner turns = new Scanner(System.in);
        while (total != 0) {
            // prints total + user input (int)
            System.out.println("Pot total: " + total);
            System.out.println(player2 + ", how many do you want to take? ");
            int num = turns.nextInt();

            // checks if guess is larger than half
            int max = total / 2;
            // failsafe (because (int) 1/2 = 0, which won't let anyone win)
            if (total == 1) {
            } else if (num > max) {
                System.out.println(
                        "You can't take away more than half! Max you can take is: " + max + "\n. Enter a new number: ");
                num = turns.nextInt();
            }
            // generates new total
            total = total - num;
            // finding out if they win
            if (total == 0) {
                System.out.println(player1 + " wins!");
                // returning and closing method, player 1 wins
                return 1;
            }

            // player 1 turn
            System.out.println("New total is " + total);
            System.out.println(player1 + ", how many do you want to take? ");
            num = turns.nextInt();
            // checks if guess is larger than half
            max = total / 2;
            // failsafe (because (int) 1/2 = 0, which won't let anyone win)
            if (total == 1) {
            }
            // if player puts in larger number than half
            else if (num > max) {
                System.out.println(
                        "You can't take away more than half! Max you can take is: " + max + "Enter a new number: ");
                num = turns.nextInt();
            }
            total = total - num;
            // if player 2 wins
            if (total == 0) {
                System.out.println(player2 + " wins!");
                return 2;
            }
        }
        // needs to include this so the method doesn't yell at me for returning nothing
        return 0;

    }

}
