package ex_13_OPPS;

public class cat {
    public static void main(String[] args) {
       // cats obj = new cats();
        cats c1 = new cats("mihi");
        cats c2 = new cats("mimo");

        //call c1 or c2 based on your choice
        System.out.println(c1.name);
        System.out.println(c2.name);

    }

}

class cats {
    String name;

 //creating constructor method
    cats()
    {
        System.out.println("df");
    }
    cats(String naming)
    {
        name = naming;
        //this.name = naming;
    }
}
