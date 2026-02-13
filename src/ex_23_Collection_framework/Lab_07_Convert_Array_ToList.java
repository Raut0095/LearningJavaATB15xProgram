package ex_23_Collection_framework;

import java.util.Arrays;
import java.util.List;

public class Lab_07_Convert_Array_ToList {
    public static void main(String[] args) {
        String array[] = {"po","pl","jo"};

        List<String> list = Arrays.asList(array);
        System.out.println(list);

    }
}
