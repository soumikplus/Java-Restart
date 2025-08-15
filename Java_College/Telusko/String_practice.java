public class String_practice {
    public static void main(String[] args) {

        String name = new String("soumik");
        System.out.println(name.concat(" Chakraborty"));
        StringBuffer sb = new StringBuffer("Smk");
        System.out.print(sb.append("Raja"));
        System.out.print(" "+sb.capacity());
    }
}
// still small doubts onn StringBuffer and StringBuilder