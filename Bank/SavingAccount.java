package prog2.Bank;

public class SavingAccount extends BankAccount {
    int operations;
    int freeOperations;
    public SavingAccount(int accountNumber, int freeOperations){
        this.accountNumber = accountNumber;
        balance = 0;
        this.freeOperations = freeOperations;
    }

    public void deposit(double amount){
        if (arePointsEnabled == true) {
            int pointsAmount = (int) amount / 10000;
            points += pointsAmount * 5;
        }
        if(operations<freeOperations){
            operations += 1;
            balance += amount;
        }
        else{
            balance += amount - 0.01*amount;
        }
    }
    public void extract(double amount) {
        if (balance - amount < 0) {
            throw new RuntimeException("It is not possible to extract that amount");
        }
        if (arePointsEnabled == true) {
            int pointsAmount = (int) amount / 10000;
            points += pointsAmount * 5;
        }
        if (operations < freeOperations) {
            balance -= amount;
            operations += 1;
        }
        else{
            balance -= amount - 0.01*amount;
        }
    }

    public void startMonth(){
        operations = 0;
    }
}


