package ex_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Interview_Wingify_Sum_Of_Array {
    public static void main(String[] args) {


        int[] Array = {2, 7};
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
            System.out.println(sum);
        }

    }
}
