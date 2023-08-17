import java.util.Scanner;

//Write a program to find sum and average of two numbers input by User (using Scanner class).
public class SunAndAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is "+ sum);

        int avg = (num1 + num2)/2;
        System.out.println("The average is "+ avg);
    }
}
