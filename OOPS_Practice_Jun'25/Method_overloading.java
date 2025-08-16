class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a , double b){
        return a+b;
    }
}

public class Method_overloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4.2,9.3));
        System.out.println(calc.add(4,5));
        System.out.println(calc.add(5,8,9));
        // System.out.println(calc.add(9.3,2.9,4.5));
    }
}
