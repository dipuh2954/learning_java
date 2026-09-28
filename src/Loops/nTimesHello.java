package Loops;

import java.util.Scanner;

public class nTimesHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times you want to print Hello World: ");
        int num = sc.nextInt();
        for (int i =1; i<=num; i++){
            System.out.println("hello World!");
        }
    }
}
