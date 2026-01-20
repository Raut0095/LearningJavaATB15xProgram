package ex_Arrays;

public class Lab_01_decaartion {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5,3};

        int marks2[]={0,4,5,0};
        System.out.println(marks2.length);
        boolean[] is_maried = {true,false,true};
        String[] s = {"poppp, kopl,lpp"};

        float[] a = new float[3];
        a[0]= 1.9f;
        a[1]=0.8f;
        a[2]= 0.90f;

        //for each loop
        for (String name:s)
        {
            System.out.println(name);
        }

        for (int num:marks2)
        {
            System.out.println(num);
        }
    }
}
