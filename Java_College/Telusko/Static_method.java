class phone2{
    String brand;
    int price;
    String network;
    static String type ;
    public static void show(phone2 ph){
        System.out.println(ph.brand+" --> "+ph.price+" --> "+type);
    }
// non static vaiable can't be accessed directly in a static method
}
public class Static_method {
    public static void main(String[] args) {
        phone2 ph1 = new phone2();
        ph1.brand = "Jio";
        ph1.network = "4G";
        ph1.price = 4999;
        phone2 ph2 = new phone2();
        ph2.brand = "Samsung";
        ph2.network = "5G";
        ph2.price = 22999;
        phone2.type = "smartphone";
//        ph1.show();
//        ph2.show();
//        phone2.show();
        phone2.show(ph2);
    }
}
