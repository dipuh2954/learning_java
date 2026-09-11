package Conditionals;

import java.util.Scanner;

public class CheckAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        if (num%5==0){
            if (num%3==0){
                System.out.println("The number is divisible by both 5 & 3.");
            }else{
                System.out.println("The number is divisible by only 5.");
            }
        }else{
            System.out.println("The number can't be divisible by any of 5 & 3.");
        }
    }
}
