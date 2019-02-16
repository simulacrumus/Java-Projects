import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name +", which do you choose? (O)dds or (E)vens?");
        String player = input.next();
        if (player.equals("O")){
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (player.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.println("Error");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+computer+" \"fingers\".");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        int sum = fingers + computer;
        System.out.println(""+fingers+" + "+computer+" = "+sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println(sum + " is ...even!");
            } else {
            System.out.println(sum + " is ...odd!");
        }
        if ( (player.equals("O") && !(oddOrEven)) || (player.equals("E") && (oddOrEven))) {
            System.out.println("That means " + name + " wins!");
        } else {
               System.out.println("That means computer wins!");
        }
        System.out.println("-----------------------------------------------");
    }
}
