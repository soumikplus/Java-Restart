public class array {
    public static void main(String[] args) {
        System.out.println("Printing array elements");
        int arr[] = new int[4];
        arr[0] = 45;
        arr[1] = 76;
        arr[2] = 92;
        arr[3] = 10;
        for(int i=0;i<4;i++){
            System.out.println(arr[i]+" ");
        }
    int arr2[][] = new int [3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr2[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println("**Normal**");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("**Enhanced**");
        for(int n[] : arr2){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
