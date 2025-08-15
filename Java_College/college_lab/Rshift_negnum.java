import java.util.Scanner;

public class Rshift_negnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a negative value ");
        int n = sc.nextInt();
        int d = n >> 1;
        int b = n >>> 1;
        System.out.println("After right shift "+d);
        System.out.println("After unsigned right shift "+b);
    }
}
