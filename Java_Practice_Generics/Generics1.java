import java.util.ArrayList;
public class Generics1 {

        public static void main(String args[]){
            System.out.println("Starting Generics in java");
            ArrayList<Integer> arrayList = new ArrayList() ;
            arrayList.add(25);
            arrayList.add(65);
            //    arrayList.add("smk");

            int a = arrayList.get(1);
            System.out.println(a);
        }


}
