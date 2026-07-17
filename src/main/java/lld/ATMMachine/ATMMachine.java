package lld.ATMMachine;

public class ATMMachine {

    private State state;
    private BankService bankService;
    // insertCard, selectOption, cancelTransaction

    public ATMMachine(){
       this.state = new IdleState();
    }

    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

    public void setAtmMachineState(State AtmMachineState){
        this.state = AtmMachineState;
    }

    public void insertCard(){
        state.cardInserted(this);
    }

    public void selectOption(TransactionType transactionType){
        state.selectOption(this, transactionType);
    }

    public void pinVerification(Integer pin){
        state.pinVerification(this, pin);
    }
}
