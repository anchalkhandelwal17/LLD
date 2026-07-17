package lld.ATMMachine;

public class CardInsertedState implements State{

    @Override
    public void idle(ATMMachine atmMachine) {

    }

    @Override
    public void cardInserted(ATMMachine atmMachine) {
        System.out.println("Card Inserted");
        atmMachine.setAtmMachineState(new PinVerificationState());
    }

    @Override
    public void selectOption(ATMMachine atmMachine, TransactionType transactionType) {

    }

    @Override
    public void pinVerification(ATMMachine atmMachine, Integer pin) {

    }

}
