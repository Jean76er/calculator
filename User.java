import java.util.Scanner;

public class User {
    private static int numA;
    private static int numB;
    private static String letter;
    private static int answer;
    static Scanner input = new Scanner(System.in);

    public static void start() {
        while(true) {
            System.out.println("Welcome to my first attempt at a calculator");
            System.out.print("Enter first number: ");
            numA = input.nextInt();
            System.out.print("Enter second number: ");
            numB = input.nextInt();
            System.out.println("Now what would you like to do with the two numbers?");
            System.out.print("a: Adds first and second number\ns: Subtracts first number by second number\nm: Multiplies first and second number\nd: divides first number by second number\n>>>>>>>>>> ");
            letter = input.next();

            switch(letter) {
                case "a": 
                    answer = Add.add(numA, numB);
                    break;
                case "s":
                    answer = Subtract.subtract(numA, numB);
                    break;
                case "m":
                    answer = Multiply.multiply(numA, numB);
                    break;
                case "d":
                    answer = Division.division(numA, numB);
                    break;
            }

            System.out.println(answer);
        }
    }
}
