public class Checker {
    private static double output;

    public static double checker(double numA, double numB, String choice) {
        switch(choice) {
            case "a": 
                output = Add.add(numA, numB);
                break;
            case "s":
                output = Subtract.subtract(numA, numB);
                break;
            case "m":
                output = Multiply.multiply(numA, numB);
                break;
            case "d":
                output = Division.division(numA, numB);
                break;
        }

        return output;
    }
}
