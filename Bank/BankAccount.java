package prog2.Bank;

abstract public class BankAccount {
    int accountNumber;
    double balance;
    int points;
    boolean arePointsEnabled;

    abstract void deposit(double amount);

    abstract void extract(double amount);

    abstract void startMonth();

    double getBalance(){
        return balance;
    }

    void onPoints(){
        arePointsEnabled = true;
    }

    void offPoints(){
        arePointsEnabled = false;
    }

    int getPoints(){
        return points;
    }


}
