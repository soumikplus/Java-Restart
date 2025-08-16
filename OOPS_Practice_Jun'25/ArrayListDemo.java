import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        ArrayList<String>languages = new ArrayList<>();

        // add elements 
        languages.add("Java");
        languages.add("Javascript");
        languages.add("Swift");
        languages.add(1,"Python");

        System.out.println(languages);

        // access elements
        String str = languages.get(0);
        System.out.println(str);

        //change
        languages.set(1,"C++");
        System.out.println(languages);
        System.out.println(languages.size());

        //remove
        languages.remove(3);
        System.out.println(languages);
        System.out.println(languages.size());

        // for each loop
        for(String language: languages)
            System.out.println(language);
    }
}

