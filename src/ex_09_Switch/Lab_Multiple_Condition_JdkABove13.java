package ex_09_Switch;

public class Lab_Multiple_Condition_JdkABove13 {
    public static void main(String[] args) {
        int itemcode = 002;

        switch (itemcode){
            case 001,002,003:
                System.out.println("Print Shampooo");
                break;
            case 005,006:
                System.out.println("printin cont");
            default:
                System.out.println("None");
        }
    }
}
