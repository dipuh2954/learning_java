package Conditionals;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num%5==0 && num%3 != 0){
            System.out.println("Divisible by 5 but not by 3.");
        }else{
            System.out.println("Doesn't satisfy the point");
        }
    }
}
