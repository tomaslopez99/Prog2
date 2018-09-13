package prog2.Semaphore;

import prog2.Semaphore.semaphore;

public class semaphoreTester {
    public static void main(String[] args) {
        semaphore s = new semaphore(10000, 5000, 15000);
        s.startRed();
    }
}

