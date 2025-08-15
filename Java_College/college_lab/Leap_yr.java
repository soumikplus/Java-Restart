public class Leap_yr {
    public static void main(String[] args) {
        System.out.println("leap years btw 2000 of 2010");
        for(int y = 2000;y<=2010;y++){
            if((y%4 == 0) && (y%100 != 0) || (y%400 == 0)){
                System.out.println(y);
            }
        }
    }
}
