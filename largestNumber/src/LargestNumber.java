import java.util.Scanner;

/*
Write a program to display largest number from given three values.
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The largest number is "+ num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The largest number is "+ num2);
        } else if(num3> num1 && num3 > num2){
            System.out.println("The largest number is "+ num3);
        }
    }
}
