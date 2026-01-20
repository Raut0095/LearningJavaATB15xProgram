package ex_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MaxTime_Asked_Max_Num {
    public static void main(String[] args) {

        int[] Array = {25,14,56,15,36,56,77,18,29,46};
        /*Arrays.sort(Array);
        System.out.println(Array[Array.length-1]);*/
        int max =  Array[0];
        for (int i=0; i<Array.length;i++)
        {
            if (Array[i]>max)
            {
                max = Array[i];
            }

        }

        System.out.println(max);

    }
}
