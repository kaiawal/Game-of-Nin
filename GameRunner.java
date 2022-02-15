package nim;
import java.util.Scanner;
import java.lang.Math;

/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim
 */
public class GameRunner {
  public static void main(String[] args) {
    // welcomes players and gets names
    System.out.println("Welcome to the Game of Nim!");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Player 1 name: ");
    String player1 = input.nextLine();
    System.out.println("Enter Player 2 name: ");
    String player2 = input.nextLine();
    System.out.println("Welcome " + player1 + " and " + player2 + ".");

    // defines variables + gets a 1 or 2 to decide who goes first
    int numb = (int) (Math.random() * 2) + 1;
    int wins1 = 0;
    int wins2 = 0;
    int playy = 0;
    int asddf = 0;

    // creates while loop to repeat until the players want to stop
    while (playy == 0) {
      // player one goes first
      if (numb == 1) {
        // calls function
        asddf = Methods.turnOne(player1, player2);
        // if turnOne returns 1
        if (asddf == 1) {
          // adds to player1 score
          wins1 = wins1 + 1;
          // shows score
          System.out.println(player1 + " has " + wins1);
          System.out.println(player2 + " has " + wins2);
          // asks to play again
          System.out.println("Play again? (YES or NO)");
          String playagain = input.nextLine();
          playagain = playagain.toLowerCase();
          // if yes, doesn't do anything and it will just return to the top
          if (playagain.equals("yes")) {
          }
          // changes playy so it breaks while loop
          else {
            playy = 2;
          }
        }
        // if turnOne returns 2
        else if (asddf == 2) {
          // adds to player2 score
          wins2 = wins2 + 1;
          // shows score
          System.out.println(player1 + " has " + wins1);
          System.out.println(player2 + " has " + wins2);
          // asks to play again
          System.out.println("Play again? (YES or NO)");
          String playagain = input.nextLine();
          playagain = playagain.toLowerCase();
          // if yes, doesn't do anything and it will just return to the top
          if (playagain.equals("yes")) {
          }
          // changes playy so it breaks while loop
          else {
            playy = 2;
          }
        }

      }
      // player 2 starts
      else if (numb == 2) {
        // calls method
        asddf = Methods.turnTwo(player1, player2);
        // if player 1 wins
        if (asddf == 1) {
          // adds score
          wins1 = wins1 + 1;
          System.out.println(player1 + " has " + wins1);
          System.out.println(player2 + " has " + wins2);
          // asks to play again
          System.out.println("Play again? (YES or NO)");
          String playagain = input.nextLine();
          playagain = playagain.toLowerCase();
          // goes back to while loop
          if (playagain.equals("yes")) {
          }
          // ends while loop
          else  {
            playy = 2;
          }
        }
        // player 2 wins
        else if (asddf == 2) {
          // adds points
          wins2 = wins2 + 1;
          System.out.println(player1 + " has " + wins1);
          System.out.println(player2 + " has " + wins2);
          // asks if want to play again
          System.out.println("Play again? (YES or NO)");
          String playagain = input.nextLine();
          playagain = playagain.toLowerCase();
          // goes back to while loop
          if (playagain.equals("yes")) {
          }
          // breaks while loop
          else  {
            playy = 2;
          }
        }
        // gets random number for which player goes first
        numb = (int) (Math.random() * 2) + 1;
      }
    }
    System.out.println("Thanks for playing!");
  }
}
