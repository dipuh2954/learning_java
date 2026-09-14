package Loops;

import java.util.Scanner;

public class APProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto you want to print: ");
        int num = sc.nextInt();

        for (int i = 4; i<=(3*num+1); i+=3){
            System.out.print(i+" ");
        }
    }
}
