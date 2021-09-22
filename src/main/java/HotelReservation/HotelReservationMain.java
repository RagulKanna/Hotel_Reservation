package HotelReservation;

import java.util.ArrayList;

public class HotelReservationMain {
    public static ArrayList<HotelDetails> details = new ArrayList<HotelDetails>();

    public static void main(String[] args) {
        HotelDetails hotel1 = new HotelDetails("Lackwood", 3, 110, 90, 80, 80);
        details.add(hotel1);
        HotelDetails hotel2 = new HotelDetails("Bridgewood", 4, 160, 110, 90, 80);
        details.add(hotel2);
        HotelDetails hotel3 = new HotelDetails("Ridgewood", 5, 220, 100, 150, 40);
        details.add(hotel3);
    }
}
