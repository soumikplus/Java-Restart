public class Sum_mul {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0;i<args.length;i++){
            int n = Integer.parseInt(args[i]);
            sum = sum + n;
            
        }
        System.out.println("Sum is : "+sum);
    }
}
