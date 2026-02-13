package ex_21_Enum;

public class Lab_01_Enum {
    public static void main(String[] args) {
        Day whatsDay = Day.THRUSDAY;
        System.out.println(whatsDay.name());
        System.out.println(whatsDay.ordinal());  //zero indexed position

    }
}
