package lld.ATMMachine;

public class BankServiceImpl implements BankService{
    @Override
    public boolean authenticate(int pin) {
        return true;
    }

    @Override
    public void withdraw() {

    }

    @Override
    public double getBalance() {
        return 0;
    }
}
