package ex_23_Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_03_ArrayListForEachLoop {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("1");
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add(4);
        myList.add(true);

        System.out.println(myList.size());
        System.out.println(myList.contains(1));
        System.out.println(myList.indexOf(4));
        System.out.println(myList.lastIndexOf(1));

        System.out.println("-----");
        for(Object a : myList)
        {
            System.out.println(a);
        }

        System.out.println("---");
        for(int i=0; i<myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        System.out.println("---");
        Iterator it = myList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


    }

