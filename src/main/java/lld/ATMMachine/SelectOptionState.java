package lld.ATMMachine;

public class SelectOptionState implements State{
    @Override
    public void idle(ATMMachine atmMachine) {

    }

    @Override
    public void cardInserted(ATMMachine atmMachine) {

    }

    @Override
    public void selectOption(ATMMachine atmMachine, TransactionType transactionType) {
        Transaction transaction = TransactionFactory.createTransaction(transactionType);
        transaction.execute(atmMachine);
        atmMachine.setAtmMachineState(new IdleState());
    }

    @Override
    public void pinVerification(ATMMachine atmMachine, Integer pin) {

    }

}
