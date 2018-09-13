package prog2.Hotel;

public class hotelTester {
    public static void main(String[] args) {
        Hotel unHotel = new Hotel(10,7, 3);
        System.out.println(unHotel.reserve(250, 270, "estandar", 3));
        System.out.println(unHotel.reserve(1, 3, "estandar", 3));
        System.out.println(unHotel.reserve(2, 5, "estandar", 3));
        System.out.println(unHotel.reserve(5, 8, "estandar", 2));
        System.out.println(unHotel.reserve(6, 10, "estandar", 3));
        System.out.println(unHotel.reserve(300, 320, "estandar", 3));
        System.out.println(unHotel.reserve(2, 7, "estandar", 3));
        System.out.println(unHotel.reserve(320, 320, "estandar", 3));
        System.out.println(unHotel.reserve(6, 10, "suite", 3));
    }
}
