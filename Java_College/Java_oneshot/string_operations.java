package Java_oneshot;

public class string_operations {
    public static void main (String[] args){
        // string concatenation
        String name1 = "Soumik";
        String name2 = "chakraborty";
        // concatenate
        String name3 = name1 +" "+ name2 ;
        System.out.println(name3);
        // find a character
        System.out.println(name1.charAt(0));
        // replace
        String name4 = name1.replace('o','a');
        System.out.println(name4);
        // String are immutability in java one never change the original one
        // substring
        System.out.println(name3.substring(0,6));
    }
}
