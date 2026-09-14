package Loops;

import java.util.Scanner;

public class GPProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        System.out.print("Enter the number from it starts: ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.print(a+" ");
            a*=r;
        }
    }
}
