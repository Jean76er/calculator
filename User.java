import java.util.Scanner;

public class User {
    private static int numA;
    private static int numB;
    private static String letter;
    private static double answer;
    static Scanner input = new Scanner(System.in);

    public static void start() {
        System.out.print("Do you want to use the terminal or the GUI?: ");
        letter = input.next();
        if(letter.toUpperCase().equals("TERMINAL")) {
            while(true) {
                System.out.println("Welcome to my first attempt at a calculator");
                System.out.print("Enter first number: ");
                numA = input.nextInt();
                System.out.print("Enter second number: ");
                numB = input.nextInt();
                System.out.println("Now what would you like to do with the two numbers?");
                System.out.print("a: Adds first and second number\ns: Subtracts first number by second number\nm: Multiplies first and second number\nd: divides first number by second number\n>>>>>>>>>> ");
                letter = input.next();

                answer = Checker.checker(numA, numB, letter);

                System.out.println(answer);
            }
        }
        else if(letter.toUpperCase().equals("GUI")); {
            new GUI();
        }
    }
}
