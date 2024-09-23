package aston.cs3ios.lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        double exchange_rate = 1.37;

        System.out.println("How much do you wish to convert?");
        Scanner scanner = new Scanner(System.in);

        double gbp = scanner.nextDouble();

        double usd = gbp * exchange_rate;

        System.out.printf("The amount in usd is %.2f%n",usd);
    }
}
