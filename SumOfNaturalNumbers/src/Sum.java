import java.util.Scanner;

/*
Write a Program to sum 1 to nth natural numbers.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the nth natural number");
        int num = scan.nextInt();

        int totalSum = 0;
        for(int i = 1; i <= num; i++){
            totalSum = totalSum + i;
        }
        System.out.println("The sum of nth natural number is "+ totalSum+".");

    }
}
