public class enhanced_forLoop {
    public static void main(String[] args) {
        System.out.println("**Printing Enhanced for loop**");
        // create array
        int arr[] = new int[4];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;

        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
