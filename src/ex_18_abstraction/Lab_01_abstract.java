package ex_18_abstraction;

public class Lab_01_abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.load10k();
    }

}

abstract class Father{
    //incomplete method
    abstract void loan50k();

    //concrete - complete method
    void load10k()
    {
        System.out.println("Given by Father");
    }
}

class Son extends Father{
    @Override
    void loan50k()
    {
        System.out.println("Given by son");
    }
}

