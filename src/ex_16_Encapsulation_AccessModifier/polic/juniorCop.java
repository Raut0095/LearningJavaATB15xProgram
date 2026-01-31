package ex_16_Encapsulation_AccessModifier.polic;

public class juniorCop {
    public static void main(String[] args) {
       cop jcop = new cop(10);
       jcop.canIShoot();  //can use this method bcz its protected in pacakage
    }
}
