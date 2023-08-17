import java.util.Scanner;

/*
Write a program to print the factorial number of given number.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fact = 1; //Initializing the factorial as 1 because anything multiplied to 0 is 0.

        //Input
        System.out.println("Enter a number to calculate factorial ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++){
        fact = fact * i;
        }
        System.out.println("The factorial is "+ fact);

    }

}
