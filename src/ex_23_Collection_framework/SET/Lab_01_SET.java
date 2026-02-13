package ex_23_Collection_framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_01_SET {
    public static void main(String[] args) {
           //avoid duplicated use SET
        //Set s = new HashSet();
        Set<String> s = new HashSet();
        s.add("apl");
        s.add("org");
        s.add("papaya");
        s.add(null); //only one null is allow
        System.out.println("--");

      //when we want to keep the order use Linked
        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        //when we want to sort the order
        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        System.out.println(ts);
        //ts.add(123); //in treeset different data types will not sort
        //ts.add(null); // can not allow null

    }
}
