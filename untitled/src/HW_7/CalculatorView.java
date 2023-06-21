package HW_7;

import java.util.List;
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayHistory(List<String> history) {
        System.out.println("History:");
        for (String operation : history) {
            System.out.println(operation);
        }
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Введите первое число: ");
        double real = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public char getOperator() {
        System.out.print("Enter operator (+, -, *, /, ^, sqrt): ");
        return scanner.next().charAt(0);
    }

    public int getPower() {
        System.out.print("Enter power: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}