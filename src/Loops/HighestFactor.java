package Loops;

import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int factor = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) { // 'i' is a factor of num
                factor = i;
                break;
            }
        }
        System.out.print("The highest factor except itself: "+factor);
    }
}
