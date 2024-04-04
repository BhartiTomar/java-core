package javacore.com.learning.core.day2session2;

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;
    
    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmount {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = initialBalance;
        
        if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("Low Balance");
        }
        

        if (initialBalance < 0) {
            throw new NegativeAmount("Negative Amount");
        }
    }
    
    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("Negative Amount");
        }
        balance += amt;
    }
    
    public float getBalance() throws LowBalanceException {
        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
            throw new LowBalanceException("Low Balance");
        }
        return balance;
    }
}
 
class NegativeAmount extends Exception {
    public NegativeAmount(String message) {
        super(message);
    }
}
 
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
 
public class D02P61 {
    public static void main(String[] args) {
        try {

            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
            account1.deposit(100);
            System.out.println("Current balance: " + account1.getBalance());
            
            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
        } catch (NegativeAmount e) {
            System.out.println("Output: NegativeAmount");
        } catch (LowBalanceException e) {
            System.out.println("Output: Low Balance");
        }
    }
}