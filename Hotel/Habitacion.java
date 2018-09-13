package prog2.Hotel;

abstract public class Habitacion {
    int capacity;
    int price;
    boolean[] occupied = new boolean[1];

    boolean reserve(int inDate, int outDate){
        if(outDate>=occupied.length){
            boolean[] occupied2 = new boolean[outDate+1];
            for(int i1 = 0; i1<occupied.length; i1++){
                occupied2[i1] = occupied[i1];
            }
            occupied = occupied2;
            if(inDate>occupied.length) {
                for (int i2 = inDate; i2 <= outDate; i2++) {
                    occupied2[i2] = true;
                }
                return true;
            }
            for(int i3 = inDate; i3<=outDate; i3++){
                if(occupied2[i3] == true){
                    return false;
                }
            }
            for(int i4 = inDate; i4<=outDate; i4++){
                occupied2[i4] = true;
            }
            return true;
        }
        for(int i3 = inDate; i3<=outDate; i3++){
            if(occupied[i3] == true){
                return false;
            }
        }
        for(int i4 = inDate; i4<=outDate; i4++){
            occupied[i4] = true;
        }
        return true;
    }
}
