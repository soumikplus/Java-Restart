class phone{
    String brand;
    int price;
    String network;
    static String type ;
    public void show(){
        System.out.println(brand+" --> "+price+" --> "+type);
    }

}
public class Static_variable {
    public static void main(String[] args) {
    phone ph1 = new phone();
    ph1.brand = "Jio";
    ph1.network = "4G";
    ph1.price = 4999;
    phone ph2 = new phone();
    ph2.brand = "Samsung";
    ph2.network = "5G";
    ph2.price = 22999;
    phone.type = "smartphone";
    ph1.show();
    ph2.show();
    }
}
