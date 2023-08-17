import java.util.Scanner;

// Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Conversion {
    public static void main(String[] args) {

/*
     # (°C x 1.8) + 32 = 86°F’ C - > F
     # (50°)F - 32) x .5556 = 10°C F - > C
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in fahrenheit");
        float tempFarenheit = sc.nextFloat();

        double convertedToCelcius = (tempFarenheit -32) * .5556;

        System.out.println("The temperature in Celsius is "+convertedToCelcius + " degree Celsius.");

        System.out.println("Enter the temp in Celsius");
        float tempCelsius = sc.nextFloat();

        double convertedToFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println("The temperature in fahrenheit is "+ convertedToFahrenheit + " degree Celsius.");

    }
}
