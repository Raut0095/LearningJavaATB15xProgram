package ex_23_Collection_framework;

import java.util.LinkedList;

public class Lab_06_LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> L3 = new LinkedList<>();
        L3.addLast("pot");
        L3.add("oto");
        L3.addFirst("bracket");
        L3.addLast("koo");


        System.out.println(L3.getFirst());
        System.out.println(L3.isEmpty());
        L3.removeFirst();
        System.out.println(L3);


    }
}
