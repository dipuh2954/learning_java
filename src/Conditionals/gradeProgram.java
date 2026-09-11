package Conditionals;

import java.util.Scanner;

public class gradeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int Subjects = sc.nextInt();
        int num = marks / Subjects;
        if (num > 90) {
            System.out.println("Excellent");
        } else if (num > 80) {
            System.out.println("Very Good");
        } else if (num > 70) {
            System.out.println("Good");
        } else if (num > 60) {
            System.out.println("Can do better");
        } else if (num > 50) {
            System.out.println("Average");
        } else if (num > 40) {
            System.out.println("Below Average");
        } else {
            System.out.println("fail");
        }
    }
}
