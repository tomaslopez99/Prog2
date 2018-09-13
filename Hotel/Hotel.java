package prog2.Hotel;

public class Hotel {
    Estandar[] eRoom;
    Suite[] sRoom;
    Presidencial[] pRoom;
    public Hotel(int estandarAmount, int suiteAmount, int presidencialAmount){
        eRoom = new Estandar[estandarAmount];
        for(int n1=0; n1<estandarAmount; n1++){
            eRoom[n1] = new Estandar(n1);
        }
        sRoom = new Suite[suiteAmount];
        for(int n2=0; n2<suiteAmount; n2++){
            sRoom[n2] = new Suite(n2);
        }
        pRoom = new Presidencial[presidencialAmount];
        for(int n3=0; n3<presidencialAmount; n3++){
            pRoom[n3] = new Presidencial(n3);
        }
    }

    public String reserve(int inDate, int outDate, String roomType, int roomNumber){
        if(roomType.equals("estandar")){
            if(eRoom[roomNumber].reserve(inDate, outDate)==true){
                return "La habitacion " + roomType + " numero " + roomNumber + " se reservo del dia " + inDate + " al dia " + outDate + ".";
            }
            return "La habitacion " + roomType + " numero " + roomNumber + " se encuentra ocupada en esas fechas.";
        }
        if(roomType.equals("suite")){
            if(sRoom[roomNumber].reserve(inDate, outDate)==true){
                return "La habitacion " + roomType + " numero " + roomNumber + " se reservo del dia " + inDate + " al dia " + outDate + ".";
            }
            return "La habitacion " + roomType + " numero " + roomNumber + " se encuentra ocupada en esas fechas.";
        }
        if(roomType.equals("presidencial")){
            if(pRoom[roomNumber].reserve(inDate, outDate)==true){
                return "La habitacion " + roomType + " numero " + roomNumber + " se reservo del dia " + inDate + " al dia " + outDate + ".";
            }
            return "La habitacion " + roomType + " numero " + roomNumber + " se encuentra ocupada en esas fechas.";
        }
        return "Ese tipo de habitacion no existe.";
    }
}
