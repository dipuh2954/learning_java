package Conditionals;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number you entered is even");
        }else if (num % 2 == 1){
            System.out.println("The number you entered is odd");
        }
    }
}