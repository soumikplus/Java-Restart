class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("meoww");
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();

    }
}
