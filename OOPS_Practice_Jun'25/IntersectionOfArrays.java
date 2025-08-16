import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] one = {1,2,3,5};
        int[] two = {3,4,5};
        System.out.println(findIntersection(one,two));

    }

    public static ArrayList<Integer> findIntersection(int[] one, int[] two){
        ArrayList<Integer>result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<one.length && j< two.length){
            if(one[i]<two[j]) i++;
            else if(one[i]>two[j]) j++;
            else{
                result.add(one[i]);
                i++;
                j++;
            }
        }
        return result;
    }
}
