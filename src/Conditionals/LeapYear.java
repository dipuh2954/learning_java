package Conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check if Leap Year or not : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Yeas! This year is a LeapYear.");
        } else {
            System.out.println("No! This year isn't a LeapYear.");
        }
    }
}
