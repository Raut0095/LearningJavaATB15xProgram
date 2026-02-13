package ex_23_Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_05_LinkedList {
    public static void main(String[] args) {

        List L1 = new ArrayList();

        List L2 = new LinkedList();
        L2.addLast("pot");
        L2.add("oto");
        L2.add("bracket");
        L2.add("koo");

        Iterator I1 = L2.iterator();
        //do you have next element
        while (I1.hasNext())
        {
            // print the element
            System.out.println(I1.next());
        }


    }
}
