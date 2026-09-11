package Conditionals;

import java.util.Scanner;

public class TwoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        if(num>9 && num<100){
            System.out.println("The number is a two digit number.");
        }else{
            System.out.println("No It's not");
        }
    }
}
