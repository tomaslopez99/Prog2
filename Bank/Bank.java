package prog2.Bank;

public class Bank {
    BankAccount[] account;
    String name;
    int numberOfSavingsAccounts;
    public Bank(String name, int numberOfSavingAccounts, int numberOfCheckingAccounts, int freeOperations, double interest, double checkingAmount, double accountMaintenance){
        account = new BankAccount[numberOfSavingAccounts + numberOfCheckingAccounts];
        this.numberOfSavingsAccounts = numberOfSavingsAccounts;
        for (int i1 = 0; i1 < numberOfSavingAccounts; i1++) {
            account[i1] = new SavingAccount(i1, freeOperations);
        }
        for (int i2 = numberOfSavingAccounts; i2 < account.length; i2++) {
            account[i2] = new CheckingAccount(i2, interest, checkingAmount, accountMaintenance);
        }
        this.name = name;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount){
        account[fromAccountNumber].extract(amount);
        account[toAccountNumber].deposit(amount);
    }

    public Check emitCheque(int accountNumberEmisor, int accountNumberReceptor, double amount){
        if(accountNumberEmisor>=numberOfSavingsAccounts) {
            Check unCheck = new Check(account[accountNumberEmisor], account[accountNumberReceptor], amount);
            return unCheck;
        }
        Check unCheck = new Check(account[accountNumberEmisor], account[accountNumberReceptor], 0);
        return unCheck;
    }

    public void depositCheque(Check unCheck){
        if(unCheck.chequeState == false){
            unCheck.deposit();
        }
        else {
            throw new RuntimeException("Check was already deposited");
        }
    }

    public void deposit(int accountNumber, double amount){
        account[accountNumber].deposit(amount);
    }
    public void extract(int accountNumber, double amount){
        account[accountNumber].extract(amount);
    }
    public double getBalance(int accountNumber){
        return account[accountNumber].getBalance();
    }

    public void onPoints(int accountNumber) {
        account[accountNumber].onPoints();
    }
    public void offPoints(int accountNumber){
        account[accountNumber].offPoints();
    }

    public int getPoints(int accountNumber) {
        return account[accountNumber].getPoints();
    }

    public void startMonth(){
        for (int i = 0; i < account.length; i++) {
            account[i].startMonth();
        }
    }
}