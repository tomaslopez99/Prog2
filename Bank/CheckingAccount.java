package prog2.Bank;

public class CheckingAccount extends BankAccount {
    double accountMaintenance;
    double interest;
    double checkingAmount;
    double minBalance;
    public CheckingAccount(int accountNumber, double interest, double checkingAmount, double accountMaintenance){
        accountNumber = accountNumber;
        balance = 0;
        this.interest = interest;
        this.checkingAmount = checkingAmount;
        minBalance = 0;
        points = 0;
        this.accountMaintenance = accountMaintenance;
    }

    public void deposit(double amount){
        if(arePointsEnabled == true) {
            int pointsAmount = (int) amount / 10000;
            points += pointsAmount * 5;
        }
        if(balance<0){
            if((balance + amount)>=0){
                balance += (amount + minBalance*(interest/100));
            }
        }
        else {
            balance += amount;
        }
    }
    public void extract(double amount){
        if(balance-amount<-checkingAmount){
            throw new RuntimeException("It is not possible to extract that amount");
        }
        balance -= amount;
        minBalance = balance;
        if(arePointsEnabled == true) {
            int pointsAmount = (int) amount / 10000;
            points += pointsAmount * 5;
        }
    }

    public void startMonth(){
        balance -= accountMaintenance;
    }
}
