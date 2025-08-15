// with interface
interface Vehicle{
    // only abstract method will be allowed here 
    // it is equivalent to public abstract void start() 
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with a key");
    }
}

// 2nd method
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("This animal eats food ");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks!");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        // Car mycar = new Car();
        // mycar.start();
        Dog mydog = new Dog();
        mydog.sound();
        mydog.eat(); 
    }
} 