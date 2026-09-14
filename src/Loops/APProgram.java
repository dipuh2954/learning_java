package Loops;

import java.util.Scanner;

public class APProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto you want to print: ");
        int num = sc.nextInt();

        for (int i = 1; i<=(2*num-1); i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 4; i<=(3*num+1); i+=3){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Enter the starting number: ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();
        int ap = a+(num-1)*d;

        for (int i =a; i<=ap; i+=d){
            System.out.print(i+" ");
        }
    }
}
