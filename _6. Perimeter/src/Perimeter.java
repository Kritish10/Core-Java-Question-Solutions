//Write a program to find the perimeter of circle, triangle, and rectangle.
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int sidesSq = scan.nextInt();

        System.out.println("Enter length of rectangle: ");
        int lengthRect = scan.nextInt();

        System.out.println("Enter breadth of rectangle: ");
        int breadthRect = scan.nextInt();

        System.out.println("Enter the radius of the circle: ");
        float radius = scan.nextFloat();

        int perimeterSquare = 4 * sidesSq;
        System.out.println("Perimeter of square is "+ perimeterSquare);

        int perimeterRectangle = (2 * lengthRect) + (2 * breadthRect);
        System.out.println("Perimeter of rectangle is "+ perimeterRectangle);

        double perimeterCircle = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is: "+perimeterCircle);



    }
}
