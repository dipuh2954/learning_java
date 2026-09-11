package Conditionals;

import java.util.Scanner;

public class CheckInsideOrOutsideCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the circle center point x: ");
        int x = sc.nextInt();
        System.out.print("Enter the circle center point y: ");
        int y = sc.nextInt();
        System.out.print("Enter the x1 of the given point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y1 of the given point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the size of the radius of the circle: ");
        int radius = sc.nextInt();

        double OA = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        if (OA>radius){
            System.out.println("The point is outside of the circle.");
        } else if (OA<radius) {
            System.out.println("The point is inside the circle.");
        } else if (OA==radius) {
            System.out.println("The point is on the circle.");
        }
    }
}
