package Loops;

import java.util.Scanner;

public class printNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2 ; i++) {
            System.out.println(i);
        }
    }
}
