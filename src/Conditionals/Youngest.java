package Conditionals;

import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram's Age: ");
        int RamsAge = sc.nextInt();
        System.out.print("Enter Shyam's age: ");
        int ShyamSAge = sc.nextInt();
        System.out.print("Enter Ajay's age: ");
        int AjaySAge = sc.nextInt();

        if (RamsAge<ShyamSAge && RamsAge<AjaySAge){
            System.out.println("Ram is youngest.");
        }else if (AjaySAge<ShyamSAge && AjaySAge<RamsAge){
            System.out.println("Ajay is youngest.");
        } else if (ShyamSAge<RamsAge && ShyamSAge<AjaySAge) {
            System.out.println("Shyam is youngest.");
        }else {
            System.out.println("Everyone of them are is of same age.");
        }
    }
}
