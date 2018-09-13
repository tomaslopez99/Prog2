package prog2.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank("Santander Rio", 3, 3, 3, 10, 10000, 1000);

        b.transfer(4, 2, 10000);
        System.out.println(b.getBalance(2));
        System.out.println(b.getBalance(4));
        b.deposit(4, 15000);
        System.out.println(b.getBalance(4));
        Check unCheck = b.emitCheque(4, 2, 1000);
        b.depositCheque(unCheck);
        b.depositCheque(unCheck);
        System.out.println(b.getBalance(2));
        System.out.println(b.getBalance(4));

    }
}
