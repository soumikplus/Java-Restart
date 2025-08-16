class computer{
    public void playMusic(){
        System.out.println("Playing Music...");

    }
    public String getMePen(int price){
        if (price >= 10 )
            return "pen";
        return "Error";
    }
}
public class method {
    public static void main(String[] args) {
        computer pc1 = new computer();
        pc1.playMusic();
        String str = pc1.getMePen(5);
        System.out.println(str);
    }
}
