package prog2.Semaphore;


public class semaphore {
    long redTime;
    long yellowTime;
    long greenTime;
    int state;

    public semaphore(long redTime, long yellowTime, long greenTime){
        this.redTime = redTime;
        this.yellowTime = yellowTime;
        this.greenTime = greenTime;
        state = 1;
    }
    public void startRed() {
        state = 1;
        goThrough();
        for (int i = 0; i < redTime / 1000; i++) {
            System.out.println("el semaforo esta en rojo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        startYellow();
    }
    public void startYellow() {
        int previousState = state;
        state = 2;
        goThrough();
        for (int j = 0; j < yellowTime / 500; j++) {
            System.out.println("el semaforo esta en amarillo");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(previousState == 1){
            startGreen();
        }
        startRed();

    }
    public void startGreen(){
        state = 3;
        goThrough();
        for (int k = 0; k < greenTime/1000; k++) {
            System.out.println("el semaforo esta en verde");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        startYellow();
    }
    public void goThrough(){
        if (state == 1){
            System.out.println("Vehiculos: Prohibido cruzar");
            System.out.println("Peatones: Permitido cruzar");
        }else if (state == 2){
            System.out.println("Vehiculos: Cruzar con precaucion");
            System.out.println("Peatones: Prohibido cruzar");
        }else{
            System.out.println("Permitido cruzar");
            System.out.println("Peatones: Prohibido cruzar");
        }

    }



}
