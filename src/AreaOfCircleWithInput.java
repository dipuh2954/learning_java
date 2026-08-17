import java.util.Scanner;

public class AreaOfCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.141;
        double area = pi * radius * radius;
        System.out.print("The area of the circle is: " + area);
    }
}
