import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
        /*
            Defining variables
         */
        Scanner in = new Scanner(System.in);
        final int trials = 6, Points = 10;
        int score = 0, minRange, maxRange;
        char continuePlay;

        System.out.println("****************WELCOME IN OUR GAME****************");

        do {

            System.out.println("Enter your range of numbers to guess between");

            System.out.print("Enter minimum value : "); /*Scan range to guess numbers between  */
            minRange = in.nextInt();

            System.out.print("Enter maximum value : ");
            maxRange = in.nextInt();

            int randomNumber = (int) (Math.random() * (maxRange - minRange)) + minRange; // store random number ;

            System.out.println("****************Now it is time to guess****************");
            for (int guess = 1 ; guess <= trials; guess++){
               System.out.print("Enter your " + guess + "st guess : ");
                int guessedNumber = in.nextInt();
                if (guessedNumber == randomNumber){
                    score += Points * (trials - guess + 1); // increasing score by (ith try * Point)
                    System.out.println("WoW! You guessed it right");
                    break;
                } else if (guessedNumber > randomNumber) {
                    System.out.println("guessed number is more than our number");
                }
                else {
                    System.out.println("guessed number is less than our number");
                }
                System.out.println("You have " + (trials - guess) + " tries left");
            }

            System.out.println("Your score is : " + score); // printing score every round
            System.out.print("Want to continue ? Yes ? NO : "); // ask user to continue playing or not
            continuePlay = in.next().charAt(0);

        }while (continuePlay == 'Y' || continuePlay == 'y');
        System.out.println("Your final score is : " + score); // printing his final score
        System.out.println("****************See u Again? ****************");
    }
}