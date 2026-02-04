package ex_18_abstraction.Interface;

public class _Interface01 {
    public static void main(String[] args) {
        car2 c1 = new car2();
        c1.ApplyBreak(); // the importace of interface is it will not show where from methods calling
    }
}

interface Brakes
{
    // we don't have compelete method in onterface.
    //methods can be complelte with default and static
    //interfaces are always incompelete in nature

    void ApplyBreak();
}

interface engine1
{
    void stopEngine();
    void startEngine();
    default  void testEngine()
    {
        System.out.println("method create with default ");
    }
}

class car2 implements Brakes, engine1{
    @Override
    public void testEngine() {
        engine1.super.testEngine();
    }

    public void ApplyBreak()
    {
        System.out.println("getting this method from brakes interface");
    }

    @Override
    public void stopEngine() {
        System.out.println("calling frim engiene");
    }

    @Override
    public void startEngine() {
        System.out.println("calling form engie");
    }
}