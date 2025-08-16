class func{

    public int mul(int a, int b){
        return a*b;
    }
}
public class demo {
    public static void main(String Args[]){
        int n1 = 15;
        int n2 = 16;
    func f = new func();
    int result = f.mul(n1,n2);
        System.out.println("After multiplication : "+result);

    }
}
