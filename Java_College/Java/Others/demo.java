class calculator{
    // properties + methods
    int a;

    public int add(int num1,int num2){
        System.out.println("After addition ");
        int r = num1 + num2;
        return r;
    }
}
class demo {
    public static void main(String[] args){
    // add()
        int num1 = 50;
        int num2 = 98; // premittive variable
        calculator cal = new calculator();  // reference veriable
        int result = cal.add(num1,num2);
        // constructor is a special method
         System.out.println(result);
    }
}
