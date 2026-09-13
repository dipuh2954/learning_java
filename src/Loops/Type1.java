package Loops;

import java.util.Scanner;

public class Type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String name = sc.nextLine();
        System.out.print("Enter how many times you want to print: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(name);
        }
    }
}
