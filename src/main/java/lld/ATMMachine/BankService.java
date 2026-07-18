package lld.ATMMachine;

import java.util.HashMap;
import java.util.Map;

public interface BankService {

    Map<Integer, Account> accounts = new HashMap<>();

    boolean authenticate(int pin);
    void withdraw();
    double getBalance();
}
