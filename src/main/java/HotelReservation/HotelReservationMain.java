package HotelReservation;

import java.util.*;

public class HotelReservationMain {
    public static int Weekday_count = 0, Weekend_count = 0;
    public static ArrayList<HotelDetails> details = new ArrayList<HotelDetails>();
    public static ArrayList<Integer> rate = new ArrayList<Integer>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        FindCheapestHotel function = new FindCheapestHotel();
        HotelDetails hotel1 = new HotelDetails("Lackwood", 3, 110, 90, 80, 80);
        details.add(hotel1);
        HotelDetails hotel2 = new HotelDetails("Bridgewood", 4, 160, 110, 90, 80);
        details.add(hotel2);
        HotelDetails hotel3 = new HotelDetails("Ridgewood", 5, 220, 100, 150, 40);
        details.add(hotel3);
        function.find_cheapest_hotel();
    }


}
