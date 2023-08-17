/*
Write a program to calculate leap year.
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        Algorithm

    1. Take integer variable year
    2. Assign a value to the variable
    3. Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
    4. Check if the year is divisible by 400, DISPLAY "leap year"
    5. Otherwise, DISPLAY "not leap year"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check.");
        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Leap Year.");
        }else{
            System.out.println("Not a leap year.");
        }

    }
}
