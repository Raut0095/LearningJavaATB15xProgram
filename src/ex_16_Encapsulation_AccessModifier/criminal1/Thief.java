package ex_16_Encapsulation_AccessModifier.criminal1;

import ex_16_Encapsulation_AccessModifier.polic.cop;

public class Thief {
    public static void main(String[] args) {
        cop thief = new cop(100);
       // thief.canIShoot(); this can not use bcz this method isprivate/protected.
        System.out.println(thief.gun);
    }
}
