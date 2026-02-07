package ex_20_exception;

public class bank {
    private String  currency;
    private Integer amount;


    public bank(String currency, Integer amount)
    {
        this.currency = currency;
        this.amount= amount;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(bank banckName) throws CurrencyMissMatch {
        if(banckName.currency.equals("INR")) {
            return banckName.amount + this.amount;
        }
        else
        {
            throw new CurrencyMissMatch("Currency Missmatch"); //throws exception added to methos
                                                                          // now add exception to bank class
        }
    }
}

// create custom exception class
    class CurrencyMissMatch extends Exception {
    public CurrencyMissMatch(String msg) {
        super(msg);
    }
}
