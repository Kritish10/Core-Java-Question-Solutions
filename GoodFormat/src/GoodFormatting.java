import java.util.Scanner;

/*
Write a program to accept the roll, name, and nationality of the person and display those
values in good format way.
 */
public class GoodFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Roll Number: ");
        int roll = scan.nextInt();

        scan.nextLine(); //Throw away Next Line

        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        System.out.println("Enter Nationality: ");
        String nationality = scan.nextLine();

        System.out.println("Roll: "+roll + "\nName: "+ name+"\nNationality: "+nationality);

    }
}
