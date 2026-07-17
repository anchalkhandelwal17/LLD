package lld.ATMMachine;

public interface State {

    // idle, cardInserted, selectOption, processTransaction

    void idle(ATMMachine atmMachine);
    void cardInserted(ATMMachine atmMachine);
    void selectOption(ATMMachine atmMachine, TransactionType transactionType);
    void pinVerification(ATMMachine atmMachine, Integer pin);

}
