import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scan.nextInt();

        char operator;
        System.out.println("Now choose an operator [+, -, *, or /]");
        operator = scan.next().charAt(0); //Character at index 0.

        switch (operator){
            case '+' -> System.out.println("Addition of "+ num1 + " and "+ num2 + " is "+(num1 + num2)+ ".");
            case '-' -> System.out.println("Subtraction of "+ num1 + " and "+ num2 + " is "+ (num1 - num2)+ ".");
            case '*' -> System.out.println("Multiplication of "+ num1 + " and "+ num2 + " is "+ (num1 * num2)+ ".");
            case '/' -> System.out.println("Division of "+ num1 + " and "+ num2 + " is "+ (num1 / num2) + ".");
            default -> System.out.println("Invalid Operator");


        }
    }
}
