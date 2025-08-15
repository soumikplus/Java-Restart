import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Value: ");
        int n1 = sc.nextInt(),n2 =sc.nextInt() ;
        int sum = (~n1 & n2)|(~n1 & n2);
        System.out.println("The XOR ouput is "+sum);
    }
}
