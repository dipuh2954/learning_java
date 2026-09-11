package Conditionals;

import java.util.Scanner;

public class CheckIfOnOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the point x: ");
        int x = sc.nextInt();
        System.out.print("Enter the point y: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("The point is on the origin");
        } else if (x==0) {
            System.out.println("The point is on the x axis");
        } else if (y==0) {
            System.out.println("The point is on the y axis");
        }else {
            System.out.println("The point is lies outside of any of the axis or origin.");
        }
    }
}
