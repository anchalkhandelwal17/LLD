package lld.ATMMachine;

public class PinVerificationState implements State{
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
        if(atmMachine.getBankService().authenticate(pin)){
            atmMachine.setAtmMachineState(new SelectOptionState());
        }
        else atmMachine.setAtmMachineState(new IdleState());
    }
}
