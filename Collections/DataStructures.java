package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DataStructures {
    public static void main(String[] args) {
        System.out.println("Data Structures : ");
        System.out.println("ArrayList --->");

        // ArrayList
        ArrayList<String>arr = new ArrayList<>();
        arr.add("Soumajit Mondal");
        arr.add("Saptarshi Mondal");

        // System.out.println(arr);
        // use of iterator
        Iterator<String>it = arr.iterator();
        while(it.hasNext()) System.out.println(it.next());

        System.out.println("LinkedList --->");

        // LinkedList
        LinkedList<String> LL = new LinkedList<>();
        LL.add("Ground");
        LL.add("Sky");
        System.out.println(LL);
        // Iterator<String>itl = LL.iterator();
        // while(itl.hasNext()) System.out.println(itl.next());


        // HashMap
        HashMap<Integer,String>dict = new HashMap<>();
        dict.put(1,"Soumik");
        dict.put(2,"Soumajit");
        System.out.println(dict);
        System.out.println("Value at index 1 : " + dict.get(1));

        // HashSet
        HashSet<Integer>set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2);

        System.out.println(set1);
        System.out.println(set1.size());



    }
}
