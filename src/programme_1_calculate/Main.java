package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please first number: ");  //input wizard
            int a = scan.nextInt();
            System.out.println("Please second number: ");  //input wizard
            int b = scan.nextInt();
            System.out.println("Enter symbol: +, -, *, /");  //input wizard
            char symbol = scan.next().charAt(0);
            Calculator calculate = new Calculator();
            calculate.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more Calculation. Please enter 'Y' or 'N'");  //input wizard
            answer = scan.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //closing the scanner object
        scan.close();
    }
}
