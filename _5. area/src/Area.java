import java.util.Scanner;

//Write a program to find the area of circle, rectangle, and triangle.
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details to calculate area of rectangle.");

        System.out.println("Enter Length:");
        int length = sc.nextInt();

        System.out.println("Enter Breadth:");
        int breadth = sc.nextInt();

        System.out.println("Enter Base: ");
        int base = sc.nextInt();

        System.out.println("Enter Height: ");
        int height = sc.nextInt();

        int areaRect = length * breadth;
        System.out.println("Area of rectangle is "+ areaRect);

        int areaSq = length * length;
        System.out.println("Area of square is "+ areaSq);

        int areaTriangle = (base * height) /2;
        System.out.println("Area of Triangle is     "+ areaTriangle);


    }
}