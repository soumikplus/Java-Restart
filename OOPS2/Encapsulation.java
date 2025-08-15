class Bank{
    private int amount;
    public void add_money(int amt){
        this.amount = this.amount + amt;
        System.out.println(amt + " added");
    }
    public void withdraw_money(int value){
        if(value <= amount){
            this.amount = this.amount - value;
            System.out.println(value + " debited");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
    public void displayBal(){
        System.out.println(amount);

    }
}
class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge >= 0) age = newAge;
        else System.out.println("Age cant be negative!");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Bank myaccount = new Bank();

        // myaccount.add_money(1000);
        // myaccount.withdraw_money(300);
        // myaccount.displayBal();

        Person p = new Person();
        p.setName("smk");
        p.setAge(30);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
