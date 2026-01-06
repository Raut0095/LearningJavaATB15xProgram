package ex_09_Switch;

public class Lab_04_JDK_ABove13 {

    public static void main(String[] args) {
        //new feature introduced

        int itemCode = 002;

        switch(itemCode){
            case 001 -> System.out.println("printing 001");
            case 002 -> System.out.println("Matching  002");

            //multiple conditions with same output
            case 003,004,005 -> System.out.println("Not matching");
            default -> System.out.println("enter correct number");
        }
    }
}
