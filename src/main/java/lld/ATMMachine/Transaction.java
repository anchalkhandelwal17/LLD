package lld.ATMMachine;

public interface Transaction {
    void execute(ATMMachine atm);
}

class WithdrawTransaction implements Transaction {

    @Override
    public void execute(ATMMachine atm) {
        System.out.println("");
    }
}

class DepositTransaction implements Transaction {

    @Override
    public void execute(ATMMachine atm) {
        System.out.println("");
    }
}

class BalanceInquiryTransaction implements Transaction {

    @Override
    public void execute(ATMMachine atm) {
        System.out.println("");
    }
}
