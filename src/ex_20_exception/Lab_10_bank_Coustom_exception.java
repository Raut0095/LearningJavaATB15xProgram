package ex_20_exception;

public class Lab_10_bank_Coustom_exception {
    public static void main(String[] args) throws CurrencyMissMatch {
         bank sbi = new bank("INR",56);
         bank icici = new bank("INR",90);

         int Total = sbi.add(icici);
        System.out.println(Total);

        bank jp_chase = new bank("usd",90);
        int Total1 = sbi.add(jp_chase);
        System.out.println(Total1);
    }


}
