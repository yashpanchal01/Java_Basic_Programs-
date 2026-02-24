import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random(); // Created rand for random num generation 
        Scanner scanner = new Scanner(System.in); //Created a scanner for input

        int numbertoguess = rand.nextInt(100)+1;
        int numberoftries = 1;
        int guess; 
        boolean hasguessedcorrectly = false;

        System.out.println("Welcome to the Game!");
        System.out.println("Guess a Number between 1 to 100");
        System.out.println("Make a Guess: ");
        
        
        while(!hasguessedcorrectly){
            guess = scanner.nextInt(); 

            // This loop ONLY runs if the user enters an invalid number
            while (guess < 1 || guess > 100) {
                System.out.println("Invalid! Please guess between range 1 and 100: ");
                guess = scanner.nextInt();
            }
            if (guess == numbertoguess){
                System.out.println("Correct Guess, You took Following number of tries:" );
                System.out.println(numberoftries);

                hasguessedcorrectly = true;
            }
            else if(guess > numbertoguess){
                System.out.println("Too high! Guess again!");
                
            }
            else if(guess < numbertoguess){
                System.out.println("Too low! Guess again!");

            }
            numberoftries++;
                
        }
    scanner.close();
    }
}
