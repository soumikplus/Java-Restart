import java.util.Scanner;

public class MaxNUserInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter n values :");
        // int max  = sc.nextInt();
        int max = 0;
        for(int i = 0;i<n;i++){
            int c = sc.nextInt();
             max = max>c?max:c;

        }
        System.out.println("Max is : " + max);
    }
}
