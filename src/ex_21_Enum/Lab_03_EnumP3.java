package ex_21_Enum;

public class Lab_03_EnumP3 {
    public static void main(String[] args) {
        //calling Hexcode
        System.out.println(HexCodes.RED.getHexCodes());
        // in automation we have to store Hexcode of colors
    }

    enum HexCodes
    {RED("#FF000"),
        GREEEN("#61FF33"),
        BLUE("#3377FF");

        //To make the code visible you have to create constructor, getter
        private String HexCodes;

        //constructor
        HexCodes (String HexCodes)
        {
            this.HexCodes = HexCodes;
        }

        String getHexCodes()
        {
            return this.HexCodes;
        }

    }
}
