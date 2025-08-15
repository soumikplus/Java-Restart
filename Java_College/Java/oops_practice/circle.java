package oops_practice01;

public class circle {
    public double radius;
    public double area(){
        return Math.PI * radius * radius ;    // same method for both the object
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

