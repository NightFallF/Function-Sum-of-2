import java.util.Scanner;

public class FncSum {
    static int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter values of A and B respectively:");
        int x = get.nextInt();
        int y = get.nextInt();
        System.out.printf("The Sum of %d and %d is: %d\n", x, y, sum(x, y));
        System.out.println("sum: " + sum(x, y));
    }
}