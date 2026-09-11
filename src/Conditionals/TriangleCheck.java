package Conditionals;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd side: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd side: ");
        int c = sc.nextInt();

        if (a+b>c || b+c>a || a+c>b){
            System.out.println("They can be the sides of a triangle.");
        }else{
            System.out.println("No! It can't be....");
        }
    }
}
