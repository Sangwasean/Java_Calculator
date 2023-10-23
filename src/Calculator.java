import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first number: ");

        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");

        double num2 = scanner.nextDouble();
        System.out.println("Choose your operator:");

        String operator=scanner.next();
        switch (operator){
            case "+":
                double sum = num1 + num2;

                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
                break;
            case "-":
                double difference=num1 - num2;
                System.out.println("The Difference of " + num1 + " and " + num2 + " is: " + difference);
                break;
            case "*":
                double product=num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
                break;
            case "/":
                double division=num1 / num2;
                System.out.println("The Division of " + num1 + " and " + num2 + " is: " + division);
                break;
        }
        scanner.close();
    }
}
