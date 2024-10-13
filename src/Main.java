import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int rollCount;
        boolean playAgain = true;
        String response;
        do
        {
            rollCount = 0;
            int die1;
            int die2;
            int die3;
            boolean done = false;
            do
            {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum"); // used Google to find how to use printf formatting
                System.out.println("-----------------------------------------------");

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3, sum); // used Google to find how to use printf formatting
                if (die1 == die2 && die2 == die3)
                {
                    done = true;
                }

            }
            while (!done);
            System.out.print("We have a triple! Enter Y to play again: ");
            response = in.next();
            playAgain = response.equalsIgnoreCase("Y");
        }
        while(playAgain);
        System.out.println("thanks for playing");
    }
}