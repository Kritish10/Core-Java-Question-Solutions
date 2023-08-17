import java.util.Scanner;

// Write a program that read the radius and length of a cylinder and computes volume.
public class RadiusAndLength {
    public static void main(String[] args) {
    // TODO: radius, length -> Input, volume claculate
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = scan.nextInt();

        System.out.println("Enter Height");
        int height = scan.nextInt();

        double volume = Math.PI * (radius * radius) * height;
        System.out.println("The volume of a cylinder is "+ volume);

    }
}
