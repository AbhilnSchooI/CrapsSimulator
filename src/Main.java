import java.lang.Math;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 6;
        int min = 1;
        boolean go = true;
        boolean crappedOut = true;
        boolean win = false;
        int sum;
        int secondSum;
        String youLost = "Sorry, you crapped out.";
        String youWin = "You win!";


        System.out.println("Rule 1: If the sum is 2, 3, or 12 it is called \"craps\" or \"crapping out\" and the game is over with a loss.");
        System.out.println("Rule 2: If the sum is 7 or 11 it is called a \"natural\" and the game is over with a win.");
        System.out.println("Rule 3: For all other values, the sum becomes \"the point\" and the user makes subsequent rolls until they either roll a 7, in which case they lose, or they roll the point sum in which case they win.");
        System.out.println();
        do {
            // vars/first output
            int rollOne = (int)(Math.random() * 6) + min;
            int rollTwo = (int)(Math.random() * 6) + min;
            sum = rollOne + rollTwo;

            System.out.println("Roll 1:\t " + rollOne);
            System.out.println("Roll 2:\t " + rollTwo);
            System.out.println("Sum:\t " + sum);

                //checks for wins/losses first instance
                if(sum == 2 || sum == 3 || sum == 12){
                    System.out.println(youLost);
                    crappedOut = false;
                }
                if(sum == 7 || sum == 11){
                    System.out.println(youWin);
                    crappedOut = false;
                }


                // while loop to finish the game
            while(crappedOut){
                System.out.println("You must roll a " + sum + " inorder to win. A roll of 7 will result in a loss");
                rollOne = (int)(Math.random() * 6) + min;
                rollTwo = (int)(Math.random() * 6) + min;
                secondSum = rollOne + rollTwo;

                System.out.println("\nRoll 1:\t " + rollOne);
                System.out.println("Roll 2:\t " + rollTwo);
                System.out.println("Sum:\t " + secondSum);

                    if(sum == secondSum) {
                        System.out.println(youWin);
                        crappedOut = false;
                    }
                    if(secondSum == 7){
                        System.out.println(youLost);
                        crappedOut = false;
                    }
            }



            // checks go again
            System.out.println("do you want to continue? [Y/N]");
            while(true){
                String keepGoing = scan.nextLine();
                if(keepGoing.equalsIgnoreCase("n")){
                    go = false;
                    break;
                }
                if(keepGoing.equalsIgnoreCase("y")){
                    crappedOut = true;
                    break;
                }
                System.out.println("please type [Y Or N]");
            }
        } while (go);

    }
}