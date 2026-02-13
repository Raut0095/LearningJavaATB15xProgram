package ex_23_Collection_framework;

import java.util.*;
import java.util.List;

public class Lab_04Sorting {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }

}
