// package to organize classes and prevent naming conflicts

import java.awt.*;

class rectangle {    // create the class rectangle
    // class properties
    public double length;
    public double breadth;
    // area method
    public double area() {
        return length * breadth;
    }
    // perimeter method
    public double perimeter() {
        return 2 * (length + breadth);
    }
    // isSquare method
    public boolean isSquare() {
        if(length == breadth)
            return true;
        else
            return false;
    }

}
class rectangleTest {
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.length = 10.5;
        r.breadth = 5.5;
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Is it a square : "+r.isSquare());
    }
}
