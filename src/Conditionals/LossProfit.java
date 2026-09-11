package Conditionals;

import java.util.Scanner;

public class LossProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Selling Price: ");
        int sp = sc.nextInt();
        System.out.print("Enter the Cost Price: ");
        int cp = sc.nextInt();
        if (sp>cp){
            System.out.println("The Shopkeeper made profit.");
        } else if (cp>sp){
            System.out.println("The shopkeeper made a Loss.");
        }else{
            System.out.println("No profit No Loss.");
        }
    }
}
