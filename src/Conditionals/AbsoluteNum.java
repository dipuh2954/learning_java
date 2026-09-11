package Conditionals;

import java.util.Scanner;

public class AbsoluteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the proposed number to calculate Absolute value: ");
        int num = sc.nextInt();
        if (num < 0){
            num = num *(-1);
            System.out.println(num);
        }else{
            System.out.println(num);
        }
    }
}
