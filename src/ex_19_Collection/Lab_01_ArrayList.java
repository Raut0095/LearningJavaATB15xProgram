package ex_19_Collection;

import java.util.ArrayList;

public class Lab_01_ArrayList {
    public static void main(String[] args) {
        //values store in the form of Array
        ArrayList<String>  name = new ArrayList<String>();
        name.add("atul");
        name.add("890");
        name.add("koook");
        name.add("uhjbh");
        System.out.println(name);
        name.add(1,"poo");
        System.out.println(name);

        name.remove(2);
        name.set(1,"lofi"); // replace atul with lofi

        //print only selected name
        System.out.println(name.get(1));

        //remove single
        System.out.println(name.remove(0));

        //clear array
        name.clear();
        System.out.println(name);
    }
}
