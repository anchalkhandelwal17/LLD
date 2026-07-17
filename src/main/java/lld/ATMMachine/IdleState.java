package lld.ATMMachine;

public class IdleState implements State{
    @Override
    public void idle(ATMMachine atmMachine) {

    }

    @Override
    public void cardInserted(ATMMachine atmMachine) {

    }

    @Override
    public void selectOption(ATMMachine atmMachine, TransactionType transactionType) {

    }

    @Override
    public void pinVerification(ATMMachine atmMachine, Integer pin) {

    }
}
