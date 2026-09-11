package Conditionals;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        if(area>perimeter){
            System.out.println("The area of the rectangle is greater than the perimeter.");
        } else if (perimeter>area) {
            System.out.println("The perimeter is greater than the area of the rectangle.");
        }else{
            System.out.println("Both are equal");
        }
    }
}
