package oops_practice01;

public class circle1 {

        public static void main(String[] args){
            circle c1 = new circle();
            circle c2 = new circle();

            c1.radius = 7;
            c2.radius = 14;


            System.out.println("Area : "+c1.area());
            System.out.println("Perimeter : "+c1.perimeter());
            System.out.println("Circumference : "+c1.circumference());

            System.out.println("Area2 : "+c2.area());
            System.out.println("Perimeter2 : "+c2.perimeter());
            System.out.println("Circumference2 : "+c2.circumference());
        }

}
