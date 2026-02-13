package ex_23_Collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_Interview_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        list.add(90);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());

        for(Integer obj: list)
        {
            System.out.println(obj);

        }
    }
}
