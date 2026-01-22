package ex_Arrays;

public class Lab_08_2nd_Highest_num {
    public static void main(String[] args) {
        int[] numb = {1,3,4,5,7,6};
        int highest = 0;
        int secondHighest =0;

        for(int num: numb)
        {
            if(num>highest)   //1>0  1>3 4>3
            {
                secondHighest = highest; // secondh= 0 1 3
                highest= num; // high=1 3 4
            }
            else if (num>secondHighest && num !=highest){
                secondHighest=num;
            }
        }
        System.out.println(secondHighest);
    }
}
