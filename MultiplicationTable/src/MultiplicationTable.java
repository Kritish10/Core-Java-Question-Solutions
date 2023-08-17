import java.util.Scanner;

/*
Write a program to print the table of given number.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to print its multiplication table.");
        int num = scan.nextInt();

        for (int i = 1; i <=10; i++){
             int output = num * i;
            System.out.println(num+ " * "+ i + " = " + output);
        }

    }
}
