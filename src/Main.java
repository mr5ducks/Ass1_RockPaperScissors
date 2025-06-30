import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //go thorugh code one more time.
        //game go agine code isn't working check notes might have something
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("time for some fun time with rock, paper, scissors");
        // all my strings (keep string rock, paper, scissors)
        String x = "y";
        String guy1 = ""; //don't change it broke everything
        String guy2 = "";
        //keep these for after checking
        String rock = "";
        String paper = "";
        String scissors = "";
        //program starts
        do {
            guy1 = ""; //don't forget to declare them again
            guy2 = ""; //don't get rid of these
            // just copy this to guy2 but change 1 to 2 don't overcomplicate
            // this is guy1 (or player one but guy one is simpler)
            System.out.println("Player 1! pick= rock, paper, or scissors?");
            while (!(guy1.equalsIgnoreCase("rock") || guy1.equalsIgnoreCase("paper") || guy1.equalsIgnoreCase("scissors"))) {
                guy1 = scan.next();
            if (!(guy1.equalsIgnoreCase("rock") || guy1.equalsIgnoreCase("paper") || guy1.equalsIgnoreCase("scissors"))) {
                System.out.println("uhh what? say rock, paper or scissors!");
                }
            }
            // this is guy2
            // check every guy its not working
            System.out.println("PLAYER 2!! NOW U GO rock paper or scissors??");
            while (!(guy2.equalsIgnoreCase("rock") || guy2.equalsIgnoreCase("paper") || guy2.equalsIgnoreCase("scissors"))) {
                guy2 = scan.next();
            if (!(guy2.equalsIgnoreCase("rock") || guy2.equalsIgnoreCase("paper") || guy2.equalsIgnoreCase("scissors"))) {
                System.out.println("dude what? do it right!!");
                }
            }
            //where the winner is decided.
            //one problome is that the else if isn't working
            if (guy1.equalsIgnoreCase(guy2)) {
                System.out.println("bruh it's a tie!");
            } else if ((guy1.equals("rock") && guy2.equalsIgnoreCase("scissors")) ||
                (guy1.equalsIgnoreCase("paper") && guy2.equalsIgnoreCase("rock")) ||
                (guy1.equalsIgnoreCase("scissors") && guy2.equalsIgnoreCase("paper"))) {
                System.out.println("OMG PLAYER 1 WINS!!");
            } else {
                System.out.println("WOW PLAYER 2 ACTUALLY WON!!");
            }

            //play again code
            System.out.println("again? yes or no");
            x = scan.next();
        } while (x.equalsIgnoreCase("y"));

        System.out.println("finished.");
        scan.close();
    }
}