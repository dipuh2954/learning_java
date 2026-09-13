package Loops;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range starting point: ");
        int i = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int num = sc.nextInt();

        for (i = i;i<=num;i++){
            if (i%2 ==0){
                System.out.print(i+ " ");
            }
        }
    }
}
