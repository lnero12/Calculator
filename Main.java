import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                try {
                    System.out.println("Enter the first number: ");
                    double firstNumber = scanner.nextDouble();

                    System.out.println("Enter the second number: ");
                    double secondNumber = scanner.nextDouble();

                    System.out.println("Choose an operation (+, -, *, /): ");
                    char operator = scanner.next().charAt(0);

                    double result;

                    switch (operator) {
                        case '+':
                            result = firstNumber + secondNumber;
                            break;
                        case '-':
                            result = firstNumber - secondNumber;
                            break;
                        case '*':
                            result = firstNumber * secondNumber;
                            break;
                        case '/':
                            if (secondNumber == 0) {
                                System.out.println("Error: Cannot divide by zero!");
                                return;
                            }
                            result = firstNumber / secondNumber;
                            break;
                        default:
                            System.out.println("Error: Invalid operator!");
                            return;
                    }

                    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input! Please enter a valid number.");
                }
            }

        }
    }
    
