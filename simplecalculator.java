import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char operation;
        double num1, num2;

        System.out.println("Simple Calculator");
        System.out.println("------------------");

        do
        {
            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble())
            {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble())
            {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            num2 = scanner.nextDouble();

            System.out.print("Choose operation (+, -, *, /, or 'q' to quit): ");
            operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0)
                    {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    } else
                    {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case 'q':
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid operation. Please choose from +, -, *, /, or 'q' to quit");
            }
        }
        while (operation != 'q');
   }
}
