import java.util.Scanner;

/*
Write a program to print the number entered by user only if the number entered is
negative.
 */
public class NegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("The number is "+num);
        } else{
            System.out.println("The number is greater than zero.");
        }
    }
}
