public class static_block {
    static int a;
    static{
        a = 10;
        System.out.println(a);
    }
    static void display(){
        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        static_block.a = 50;
        System.out.println(static_block.a);
        static_block.display();
    }
}
