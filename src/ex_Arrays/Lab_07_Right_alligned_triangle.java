package ex_Arrays;

public class Lab_07_Right_alligned_triangle {
    public static void main(String[] args) {
        int n=3;

        for (int i=0; i<n; i++)
        {
            /* i=0, 0<n
            space =0; 0>3-0-1=2 --->
            * */
            for (int space=0; space> n-i-1; space++)//--> 0,0 0,1 / This will add space
            {
                System.out.print(" ");
            }
            for (int star=0 ; star<=i; i++) ///  This will add star
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
