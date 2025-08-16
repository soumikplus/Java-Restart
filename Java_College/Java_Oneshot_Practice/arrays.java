package Java_oneshot;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 97;
        marks[1] = 90;
        marks[2] = 95;
        System.out.println(marks[0]);
        // length
        System.out.println( marks.length);
        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        int[] score  = {90,100,98};
        System.out.println(score[1]);
        int[][] finalmarks = {{70,50,70},{45,62,75}};
        System.out.println("Marks of Second student in Second subject = "+finalmarks[1][1]);


    }
}
