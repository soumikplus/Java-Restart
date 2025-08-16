package Java_oneshot.methods;

public class method {
    public static void main(String[] args){
            person Soumik = new person();
            Soumik.showName("Soumik");

            person Riju = new person();
            Riju.showName("Riju");
            // Here showname is method so we need to call it with "object."
            // It is objects' behaviour

            person.display();   // Here this is static method
            // Static method means method inside a class without an object

    }
}
