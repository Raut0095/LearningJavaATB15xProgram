package Task;

public class GradeCalculator {
    public static void main(String[] args) {
        int Score = 85;
        char grade;

        if (Score>=90 && Score<=100)
        {
           grade ='A';
        } else if (Score>=80 && Score < 90) {
            grade='B';
        }
        else if (Score>=70 && Score<80)
        {
            grade = 'C';
        } else if (Score>=60 && Score <70) {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Your grade is"+ grade);
    }
}
