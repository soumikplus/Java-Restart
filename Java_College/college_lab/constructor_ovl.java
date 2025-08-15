class constructor_ovl{
    int a,b;
    constructor_ovl(){
        a = 10;
        b = 20;
        System.out.println(" "+a+" "+b);
    }
    constructor_ovl(int a,int b){
        this.a = a;
        this.b = b; 
        System.out.println(" "+a+" "+b);
    }
    public static void main(String[] args) {
        constructor_ovl obj1 = new constructor_ovl();
        constructor_ovl obj2 = new constructor_ovl(30,50);
    }
}