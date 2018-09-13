package prog2.SubeCard;

public class SubeCard {
    int pruebaa;
    float balance;
    public SubeCard(){
        balance = 0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean chargeTrip(float amount){
        if(amount>(balance+30)){
            return false;
        }
        balance -= amount;
        return true;
    }
    public float checkBalance(){
        return balance;
    }
}