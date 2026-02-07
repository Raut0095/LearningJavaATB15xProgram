package ex_19_Collection;

import java.util.LinkedList;

public class Lab_02_LinkedList {
    public static void main(String[] args) {
        //value store in the form of wlist
        LinkedList<String> name = new LinkedList<String>();
        name.add("atul");
        name.add("890");
        name.add("koook");
        name.addFirst("he;;");

        name.removeFirst();
        System.out.println(name);

        //use for each loop
          for(String a: name)
          {
              System.out.println(a);
          }
    }

}
