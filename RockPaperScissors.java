package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            int comp = rand.nextInt(3) + 1;
            Scanner userInput = new Scanner(System.in);
            System.out.println("Choose (r)ock, (p)aper, or (s)cissors.");
            String n = userInput.nextLine();
            int user = 5;
            switch(comp) {
                case(1):
                    System.out.println("The computer chose rock");
                    break;
                case(2):
                    System.out.println("The computer chose paper");
                    break;
                default:
                    System.out.println("The computer chose scissors");
            }
            switch(n) {
                case("r"):
                    user = 1;
                    System.out.println("You chose rock");
                    break;
                case("p"):
                    user = 2;
                    System.out.println("You chose paper");
                    break;
                case("s"):
                    user = 3;
                    System.out.println("You chose scissors");
                    break;
                default:
                    System.out.println("Please enter something valid.");
            }
            int result = user - comp;
            switch(result) {
                case(0):
                    System.out.println("It's a draw");
                    break;
                case(1):
                    System.out.println("You win!");
                    break;
                case(-2):
                    System.out.println("You win!");
                    break;
                default:
                    System.out.println("You lose");
            }
        }   catch(Exception e) {
            System.out.println("Please only enter r, p, or s.");
        }
    }   
}
