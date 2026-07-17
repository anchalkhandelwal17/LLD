package lld.ATMMachine;

public interface BankService {
    boolean authenticate(int pin);
    void withdraw();
    double getBalance();
}
