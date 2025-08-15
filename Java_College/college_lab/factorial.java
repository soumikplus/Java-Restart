class factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        factorial obj = new factorial();
        System.out.println("Factorial is "+ obj.fact(n));
    }
    public int fact(int n){
        if(n == 0) return 1;
        else return n * fact(n-1);
    }
}
