package Learning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App3 {
    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        set1.add("swan");

        System.out.println(set1);

        for(String element: set1){
            System.out.println(element);
        }

        if(set1.contains("aardvark"))
            System.out.println("Containse aardvark");
        if(set1.contains("mouse"))
            System.out.println("Containse mouse");

    }
}
