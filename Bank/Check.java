package prog2.Bank;

public class Check {
    BankAccount emisor;
    BankAccount receptor;
    double amount;
    boolean chequeState;
    public Check(BankAccount emisor, BankAccount receptor, double amount){
        this.emisor = emisor;
        this.receptor = receptor;
        this.amount = amount;
        chequeState = false;
    }

    public void deposit(){
        emisor.extract(amount);
        receptor.deposit(amount);
        chequeState = true;
    }

    public boolean chequeState(){
        return chequeState;
    }

    public void changeReceptor(BankAccount newReceptor){
        receptor = newReceptor;
    }
}
