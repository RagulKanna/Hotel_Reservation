package HotelReservation;


import static HotelReservation.HotelReservationMain.*;

public class AddRating {

    public static int lackwood_rating,bridgewood_rating,ridgewood_rating;
    public void add_rating(){
        System.out.print("\nEnter rating for lackwood hotel : ");
        lackwood_rating = scan.nextInt();
        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, 110, 110, 90, 90);
        details.add(hotel1);

        System.out.print("\nEnter rating for bridgewood hotel : ");
        bridgewood_rating = scan.nextInt();
        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, 150, 150, 50, 50);
        details.add(hotel2);

        System.out.print("\nEnter rating for ridgewood hotel : ");
        ridgewood_rating = scan.nextInt();
        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, 220, 220, 150, 150);
        details.add(hotel3);

        hotel_rating_map();
        System.out.println("\nChanged_Hotel_rating: " + hotelmap);
    }

    private void hotel_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getHotel_rating());
        }
    }
}
