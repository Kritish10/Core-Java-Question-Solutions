import java.util.Scanner;

//Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
public class SI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter P");
        float p = scan.nextInt();

        System.out.println("Enter T");
        float t = scan.nextInt();

        System.out.println("Enter R");
        float r = scan.nextInt();

        float SI = (p * t * r)/100;
        System.out.println("The SI unit is "+ SI);
    }
}
