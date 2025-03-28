package mySecondApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        
        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();

    
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        
        System.out.println("Welcome " + forename + " " + surname);

      
        double x = 10;
        double y = 2;

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

   
        System.out.println("Enter two numbers separated by the Enter key:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        scanner.close();
    }
}
