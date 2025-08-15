 class cylinder {
    public double height;
    public double radius;
    public double volume(){
        return Math.PI * radius * height;
    }
}
class testCylinder{
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.height = 5;
        c.radius = 6;
        System.out.println(c.volume());
    }
}
