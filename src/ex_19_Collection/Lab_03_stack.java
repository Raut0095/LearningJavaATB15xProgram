package ex_19_Collection;

import java.util.ArrayDeque;
import java.util.Stack;

public class Lab_03_stack {
    //LIFO - Last in first out
    public static void main(String[] args) {
        Stack<String> name = new Stack<String>();
        name.push("atul");
        name.push("890");
        name.push("koook");

        System.out.println(name);

        name.pop();
        System.out.println(name);


        ArrayDeque<String> name1 = new ArrayDeque<String>();// FIFO
        name1.push("atul");
        name1.push("890");
        name1.push("koook");


        System.out.println(name1);

        name.pop();
        System.out.println(name1);
    }
}
