/*
Write a program that converts pounds into kg. The program prompts the user to enter
number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
 */
import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //TODO -> Take input in pounds and print in kg

        System.out.println("Enter weight in Pounds.");
        float weightInPounds = scan.nextFloat();
        /*

            # 1 Pound (lbs) = 0.45359237 kilogram (kg)
            # 5 lbs = 5 x 0.45359237 kg

         */

        double convertedToKg = weightInPounds * 0.45359237;
        System.out.println("The pound after being converted to KG is: "+ convertedToKg );
    }
}
