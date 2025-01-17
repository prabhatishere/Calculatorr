public class mul {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Multiplication <num1> <num2>");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            System.out.println("The result is: " + (num1 * num2));
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numbers.");
        }
    }
}
