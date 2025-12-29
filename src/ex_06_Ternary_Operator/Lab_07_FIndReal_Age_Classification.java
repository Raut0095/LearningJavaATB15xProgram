package ex_06_Ternary_Operator;

public class Lab_07_FIndReal_Age_Classification {
    public static void main(String[] args) {
       String age_input_string = args[0];
        System.out.println(age_input_string instanceof String); //check this is string or not -true in console
       // now convert string to int using  function integer.parseInt
        int age_user_input = Integer.parseInt(age_input_string); //get real input here as 25

        String result = (age_user_input <18) ? "Minor" : (age_user_input<=60)? "Adult" : "Senior Citzen";
        System.out.println(result);
    }
}
