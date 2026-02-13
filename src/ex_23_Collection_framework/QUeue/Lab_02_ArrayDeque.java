package ex_23_Collection_framework.QUeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_02_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(2);
        deck.push(3);
        System.out.println(deck);
    }
}
