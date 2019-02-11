import java.util.Scanner;

public class TravelPlanner{

    public static void main(String[] args) {

        introduction();
        budget();
        time();
        distance();
    }

    public static void introduction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vacation planner!");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String location = input.nextLine();
        System.out.println("Great, " + name + " ! " + location + " sounds like a great trip");
    }

    public static void budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int traveldays = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();
        System.out.print("How many "+ currency + " are there in 1 USD?");
        double rate = input.nextDouble();
        System.out.println("If you are travelling for " + traveldays + " that is the same " + traveldays*24 +
                " hours or " + traveldays*24*60 + " minutes");
        System.out.println("If you are going to spend " + money + " USD that means per day you can spend up to " + money/traveldays +
                " USD");
        System.out.println("Your total budget in " + currency + " is " + money*rate + " " + currency +
                " which per day is " + money*rate/traveldays + " " + currency);
    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int timedifference = input.nextInt();
        System.out.println("That means that when it is midnight at home, it will be " + timedifference + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + (timedifference+12)%24 + ":00");

    }

    public static void distance() {
        Scanner input = new Scanner(System.in);


    }




}
