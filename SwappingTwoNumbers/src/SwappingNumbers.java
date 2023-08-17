import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = sc.nextInt();

        System.out.println("Enter second number");
        int y = sc.nextInt();

        //Using temp variable
        int temp = x;

        //Swapping
         x = y;
         y = temp;

        System.out.println("The reversed value of X is "+x);
        System.out.println("The reversed value of Y is "+y);

        /*
        ---------------WITHOUT USING TEMP VARIABLE--------------
         */
        System.out.println("Enter first num to swap without a temp variabe");
        int num1 = sc.nextInt();
        System.out.println("Enter second num to swap without a temp variabe");
        int num2 = sc.nextInt();

        //first variable is first added to the second variable and stored in first variable.
        num1 = num1 + num2; // 25 = 10 + 15

        //second variable is subtracted from first variable and stored in second variable
        num2 = num1 - num2; // 10 = 25 - 15

        // the value of 2nd variable is subtracted from 1st and stored in first variable.
        num1 = num1 - num2; // 15 = 25 - 10

        System.out.println("The swapped variables for num1 is "+ num1);
        System.out.println("The swapped variables for num2 is "+ num2);



    }
}
