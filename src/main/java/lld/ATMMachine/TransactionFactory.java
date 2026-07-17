package lld.ATMMachine;

public class TransactionFactory {

    public static Transaction createTransaction(TransactionType transactionType){

       return switch (transactionType){
            case DEPOSIT -> new DepositTransaction();

            case WITHDRAW -> new WithdrawTransaction();

            case BALANCE_INQUIRY -> new BalanceInquiryTransaction();

            default -> throw new IllegalArgumentException("Please provide valid input type");
        };
    }
}
