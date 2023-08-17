import java.util.Scanner;

/*
Write a Program to accept three sides of triangle and display which kind of triangle is
formed.
 */
public class TypesOfTraingle {
    public static void main(String[] args) {
    /*
    Equilateral Triangle
    Scalene Triangle
    Isosceles Triangle
     */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side.");
        int side1 = sc.nextInt();

        System.out.println("Enter the second side");
        int side2 = sc.nextInt();

        System.out.println("Enter the third side");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Isosceles Triangle");
        } else{
            System.out.println("Scalene Triangle");
        }
    }
}
