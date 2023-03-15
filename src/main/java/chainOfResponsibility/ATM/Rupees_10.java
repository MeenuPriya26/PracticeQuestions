package chainOfResponsibility.ATM;

public class Rupees_10 implements Currency{
    @Override
    public void dispense(Amount amount) {
        int amt=amount.getTotal();

    }

    @Override
    public void setNextCurrency(Currency nextCurrency) {

    }
}
