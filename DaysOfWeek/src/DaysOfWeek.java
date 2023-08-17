/*
Program to input the number of (1...7) and translate to its equivalent name of the day of
the week.
 */
import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day in number (Ex:1 for sunday, 2 for monday)");
        int day = scan.nextInt();

        switch (day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input.");
        }
    }
}
