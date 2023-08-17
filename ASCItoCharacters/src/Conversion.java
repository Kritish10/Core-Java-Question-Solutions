import java.util.Scanner;

/*
Write a program that receives an ASCII code (between 0 – 128) and display its character
[example: 97 (input) ->a(output)].
 */
public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Input
        System.out.println("Enter the ASCII code between 0-128");
        int ASCII = scan.nextInt();

        System.out.println("The output is "+ (char)ASCII); //(Char) changed the ASCII value to character.

    }
}
