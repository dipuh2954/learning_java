package Conditionals;

import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter it's length: ");
        int length = sc.nextInt();
        System.out.print("Enter it's breadth: ");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("yes! it's a square.");
        }else{
            System.out.println("No! It's not.");
        }
    }
}
