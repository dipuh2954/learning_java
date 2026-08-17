import java.util.Scanner;

public class Taking_Innput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter a number: \n");
        x = sc.nextInt();
        int y = x * x;
        System.out.print("square of number that you entered: " + y);
    }
}
