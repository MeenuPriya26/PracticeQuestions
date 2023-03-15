package chainOfResponsibility.ATM;

public interface Currency {
    void dispense(Amount amount);
        void setNextCurrency(Currency nextCurrency);
}
