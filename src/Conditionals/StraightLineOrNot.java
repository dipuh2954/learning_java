package Conditionals;

import java.util.Scanner;

public class StraightLineOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the points: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        if ((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)){
            System.out.println("Straight Line.");
        }else{
            System.out.println("not straight Line");
        }
    }
}
