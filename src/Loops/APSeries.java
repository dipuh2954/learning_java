package Loops;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto want to print: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num ; i++) {
            if (num%i != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
