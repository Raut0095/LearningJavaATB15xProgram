package ex_09_Switch;

public class LabInteview_char_Zeta {
    public static void main(String[] args) {

        /*
        *  boolean b = true;
        //ANs: Boolean not support switch
        switch(b)
        {

        }*/
        char ch = 'A';

        switch (ch)
        {
            case 65:
                System.out.println("Its ASCII match");
                break;
            default:
                System.out.println("Np match");
        }


    }
}
