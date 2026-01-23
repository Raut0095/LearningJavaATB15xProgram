package ex_13_OPPS;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Lab_02_Babay_Overloading_constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby("Novan", 10);
        System.out.println(b1);
    }
}


    class Baby
    {
        String name;
        int age;


        Baby() {
            System.out.println("def cak");
        }

        Baby(String names, int ages) {
            name = names;
            age= ages;
            System.out.println("name- age printing"+ name + age);
        }
    }

