class phone3{
    String brand;
    int price;
    static String type ;
    // constructor
    public phone3(){
        brand = " ";
        price = 19999;

        System.out.println("Inside constructor\n");
    }
    // static block
    static{
        type = "Smartphone";
        System.out.println("Inside static block\n");
    }
    public void show(){
        System.out.println(brand+" --> "+price+" --> "+type);
    }

}
public class static_block {
    public static void main(String[] args) {

        phone3 ph1 = new phone3();
        ph1.brand = "Jio";

        ph1.price = 4999;
        phone3 ph2 = new phone3();
        ph2.brand = "Samsung";

        ph2.price = 22999;
        phone3.type = "smartphone";
        ph1.show();
        ph2.show();
        // we can use class.forName(className) just to load the class when no class is inside the main method
    }
}
