public class Conv_short {
    public static void main(String[] args) {
        byte b = Byte.parseByte(args[0]);
        short s = (short)b;
        System.out.println("converted short value is "+s);
    }
}
