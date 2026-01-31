package ex_16_Encapsulation;

public class Lab_01_Realexample {
    public static void main(String[] args) {


        ICICIBank ami = new ICICIBank("sam",900);

        ami.setName("ram", true);// this should not allowed/ jump line 24
        System.out.println(ami.getName());
    }

}

class ICICIBank{
    //this is the in class encapsulation
    //within the class childs can be use by other people by getter setter
    private String name;
    private long bal;

    public String getName()
    {
        return name;
    }

    public void setName(String name, boolean isCasher) {
        if(isCasher) {
            this.name = name;
        }
        else
        {
            System.out.println("Not allowed");
        }
    }

    public long getBal() {
        return bal;
    }
    public void setBal(){
        this.bal= bal;
    }
/// using constructor to make sure values are set
    ICICIBank(String name, long bal){
        this.name= name;
        this.bal=bal;
     }
}