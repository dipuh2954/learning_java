package Conditionals;

import java.util.Scanner;

public class CheckMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num%5==0 || num%3 ==0){
            if (num%15 != 0){
                System.out.println("The input is not divisible by 15 but divisible by 5 & 3.");
            }
            else{
                System.out.println("It's also divisible by 15 too.");
            }
        }else{
            System.out.println("It's not divisible by any of the tasked numbers.");
        }
    }
}
