package ex_16_Encapsulation;

public class simpleClass
{

    static class A
    {
        private int value; //data hiding bcz of private variable
        public void setValue(int x)
        {
            value=x;
        }
        public int getValue()
        {
           return value;
        }
    }

    class B
    {
        public static void main(String[] args) {
            A r= new A();
            r.setValue(100);
            System.out.println(r.getValue());
        }
    }

}
