import java.util.Scanner;

public class LandRshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value and power of 2 :" );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = a << b;
        int n = a >> b;
        System.out.println("Multiplication value "+m);
        System.out.println("Divisor value "+n);


    }
}
