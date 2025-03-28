package mySecondApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için scanner

        // Kullanıcıdan adını alıyoruz
        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();

        // Kullanıcıdan soyadını alıyoruz
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        // Hoş geldin mesajı
        System.out.println("Welcome " + forename + " " + surname);

        // Matematiksel işlemler
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

        // Kullanıcıdan iki sayı alıyoruz
        System.out.println("Enter two numbers separated by the Enter key:");

        // İki sayıyı almak için scanner.nextDouble() kullanıyoruz
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        // Scanner'ı en son kapatıyoruz
        scanner.close();
    }
}
