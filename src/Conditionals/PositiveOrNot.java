package Conditionals;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num %5 == 0){
            System.out.println("Yes , This number is divisible by 5.");
        } else {
            System.out.println("No! This number is not divisible by number 5.");
        }
    }
}
