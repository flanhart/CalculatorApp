import java.util.Scanner;
 class RunCalculator {

    public static void main(String[] args){

        double num1 = 0.0;
        double num2 = 0.0;
        char operator;
        double answer = 0.0;
        boolean isFinished = false;
        String response;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number please: ");
            num1 = scanner.nextDouble();
            System.out.println("Enter second number please");
            num2 = scanner.nextDouble();
            System.out.println("Please select one of the following:\n a. Add\n b. Subtract\n c. Multiply\n d. Divide");
            operator = scanner.next().charAt(0);


            switch (operator) {
                case 'a':
                    addition(num1, num2);
                    break;
                case 'b':
                    subtraction(num1, num2);
                    break;
                case 'c':
                    multiplication(num1, num2);
                    break;
                case 'd':
                    division(num1, num2);
                    break;
            }
            System.out.println("Would you like to continue? yes/no");
            response = scanner.next();

            if (response.equals("yes")) {
                isFinished = true;
            }
            else {
                isFinished = false;
            }

        } while (isFinished);



    }

     public static void addition(double number1, double number2) {
         double sum = number1 + number2;
         System.out.println(number1 + " + " + number2 + " = " + sum);
     }
     public static void subtraction(double number1, double number2) {
        double diff = number1 - number2;
         System.out.println(number1 + " - " + number2 + " = " + diff);
     }
     public static void multiplication(double number1, double number2) {
        double product = number1 * number2;
         System.out.println(number1 + " * " + number2 + " = " + product);
     }
     public static void division(double number1, double number2) {
        double quotient = number1 / number2;
         System.out.println(number1 + " / " + number2 + " = " + quotient);
     }
}
