    class func2 {
    
        public int mul(int a, int b, int c){
            return a*b*c;
        }
        public double mul(double a, int b){
            return a*b;
        }
    }
    public class overloading {
        public static void main(String Args[]){
            int n1 = 15;
            int n2 = 17;
            int n3 = 25;
            func2 f = new func2();
            int result = f.mul(n1,n2,n3);
            System.out.println("After multiplication : "+result);

        }


}
