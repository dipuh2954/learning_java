package Conditionals;

import java.util.Scanner;

public class ThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("The integer is positive three digit integer.");
        }else{
            System.out.println("It's not");
        }
    }
}
