package lld.ATMMachine;

import java.time.LocalDate;

public class Card {
    // number, validTill
    private int cardNumber;
    private LocalDate validTill;

    public int getCardNumber() {
        return cardNumber;
    }

    public LocalDate getValidTill() {
        return validTill;
    }
}
