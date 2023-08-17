import java.util.Scanner;

/*
Write a program to relate two integers entered by user using = =or > or < sign.
 */
public class ComparisonOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Num1 is greater than Num2.");
        } else if (num1 < num2){
            System.out.println("Num2 is greater than Num1.");
        } else{
            System.out.println("Num1 and Num2 are equal.");
        }

    }
}
