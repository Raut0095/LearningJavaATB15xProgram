package ex_23_Collection_framework.QUeue;

import java.util.PriorityQueue;

public class Lab_01_Que {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());  //who is 1st
        System.out.println(q);
        System.out.println(q.poll());  // remove
        System.out.println(q);


    }
}
