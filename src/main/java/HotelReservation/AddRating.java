package HotelReservation;


import static HotelReservation.HotelReservationMain.*;

public class AddRating {


    public static void add_rating(int lackwood_rating, int bridgewood_rating, int ridgewood_rating) {
        System.out.print("\nThe rating for lackwood hotel : 3");

        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, 110, 110, 90, 90);
        details.add(hotel1);

        System.out.print("\nThe rating for bridgewood hotel : 4");

        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, 150, 150, 50, 50);
        details.add(hotel2);

        System.out.print("\nThe rating for ridgewood hotel : 5");

        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, 220, 220, 150, 150);
        details.add(hotel3);

        hotel_rating_map();
        System.out.println("\nChanged_Hotel_rating: " + hotelmap);
    }

    private static void hotel_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getHotel_rating());
        }
    }
}
