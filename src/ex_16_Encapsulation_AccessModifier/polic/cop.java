package ex_16_Encapsulation_AccessModifier.polic;

public class cop {
    public int gun;
    public String iCard;

    public cop(int bulllet)
    {
      this.gun = bulllet;
    }

    protected void canIShoot() //can be use within the pacakage
    {
        System.out.println("Yes You can Shoot");
    }
    void thisisDfault()  //default is work as protected
    {
        System.out.println("Hi,cop");
    }
}
