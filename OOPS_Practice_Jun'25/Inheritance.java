class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
    void sleep(){
        System.out.println("Animal sleeps");
    }
}
class Dog extends Animal{
    void bark(String a){
        System.out.println(a + " is barking");
    }
}

public class Inheritance {
 public static void main(String[] args) {
    Dog tommy = new Dog();
    tommy.bark("Tommy");
    tommy.eat();
    tommy.sleep();
 }   
}
