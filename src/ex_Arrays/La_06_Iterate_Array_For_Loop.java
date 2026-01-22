package ex_Arrays;

public class La_06_Iterate_Array_For_Loop {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " |");
                /*  i=0 j=0,1,2 Array[(0,0), (0,1),(0,2)] after i++
                           (1,0),(1,1), (1,2)

                * */
            }
            System.out.println();
        }

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print("* " + " |");
                /*  Array[(0,0), (0,1),(0,2)] after i++
                           (1,0),(1,1), (1,2)

                * */
            }
            System.out.println(" ");
        }
    }
}
