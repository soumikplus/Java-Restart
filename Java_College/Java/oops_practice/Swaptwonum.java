package oops_practice01;

public class Swaptwonum {
    int a,b;                    // take instance variable
    Swaptwonum(int x,int y){    // assign x and y to the instance variable this.a and this.b
        this.a = x;
        this.b = y;
    }
    void swap(){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println ("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args){
        Swaptwonum obj = new Swaptwonum(10,20);
        obj.swap();
    }
}
