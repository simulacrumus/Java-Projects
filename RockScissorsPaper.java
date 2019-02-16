import java.util.Scanner;
public class RockScissorsPaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What chooses player one?");
        String playerOne = input.next();
        System.out.println("What chooses player two");
        String playerTwo = input.next();

        if ( (playerOne.equals("rock") && playerTwo.equals("scissors")) || (playerOne.equals("paper")
                && playerTwo.equals("rock")) || (playerOne.equals("scissors") && playerTwo.equals("paper"))) {
            System.out.println("Player One Wins!");
        } else if ((playerOne.equals("scissors") && playerTwo.equals("rock")) || (playerOne.equals("rock")
                && playerTwo.equals("paper")) || (playerOne.equals("paper") && playerTwo.equals("scissors"))) {
            System.out.println("Player Two Wins!");
        }
        else {
            System.out.println("Tied!");
        }
    }
}